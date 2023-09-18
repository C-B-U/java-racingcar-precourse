package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.constant.MoveStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("MoveStatus 리스트 를 가지는 일급컬렉션에서")
class MoveStatusesTest {

    @Test
    @DisplayName("남은 MoveStatus가 없을 때 예외를 던진다.")
    void getNext() {
        final MoveStatuses moveStatuses = new MoveStatuses(Arrays.asList());

        Assertions.assertThatThrownBy(moveStatuses::getNext)
                .isInstanceOf(IllegalStateException.class);
    }
}

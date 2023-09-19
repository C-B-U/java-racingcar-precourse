package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TryCountTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @DisplayName("시도 횟수에 0이하의 숫자를 입력할 경우 예외 발생")
    @Test
    void tryCountException() {
        int count = 0;

        assertThatThrownBy(() -> new TryCount(count))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}

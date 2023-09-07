package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.message.ErrorMessage;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    // 공백 포함 여부
    @Test
    @DisplayName("이름 입력에 공백이 포함되어 있으면 예외가 발생합니다.")
    void carsNameTest1() {
        String name = "지윤, 윤지";
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Cars(name));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.HAS_BLANK.toString());
    }

    // 콤마 구분 여부
    @Test
    @DisplayName("이름 입력에 콤마로 구분되어 있지 않으면 예외가 발생합니다.")
    void carsNameTest2() {
        String name = "지윤,윤지,";
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Cars(name));
        assertThat(e.getMessage()).isEqualTo(ErrorMessage.NAMES_SEPARATED_COMMA.toString());
    }

    // convertTest
    @Test
    @DisplayName("convert 메서드는 ,를 기준으로 쪼갠 리스트를 반환한다.")
    void carsNameTest3() {
        String names = "지윤,윤지,지지,윤윤";
        assertThat(new Cars(names).convert(names).size()).isEqualTo(4);
    }
}
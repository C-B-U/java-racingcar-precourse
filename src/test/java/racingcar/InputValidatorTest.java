package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {

    private static final String ERROR = "[ERROR]";
    InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("쉼표를 포함하여 입력값을 2명이상 입력하지 않았을 때 에러가 발생한다.")
    void inputContainDivision(){
        assertThatThrownBy(() -> inputValidator.validateContainDivision("pobi,"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR);
    }

    @Test
    @DisplayName("자동차 이름이 5자를 초과하면 에러가 발생한다.")
    void inputCarNamesLength(){
        assertThatThrownBy(() -> new Car("junsu12"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR);
    }

    @Test
    @DisplayName("시도할 횟수가 1회 이상이 아니라면 에러가 발생한다.")
    void inputTryCount(){
        assertThatThrownBy(() -> inputValidator.validateTryCount(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR);
    }
}

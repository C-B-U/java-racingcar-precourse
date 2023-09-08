package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {

    private static final String ERROR = "[ERROR]";

    @Test
    @DisplayName("쉼표를 포함하여 입력값을 2명이상 입력하지 않았을 때 에러가 발생한다.")
    void inputContainDivision(){
        InputValidator inputValidator = new InputValidator();
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
}

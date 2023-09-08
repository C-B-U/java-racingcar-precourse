package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {

    private static final String ERROR = "[ERROR]";

    @Test
    @DisplayName("쉼표를 포함하여 입력값을 2명이상 입력했는지 확인한다.")
    void inputContainDivision(){
        InputValidator inputValidator = new InputValidator();
        assertThatThrownBy(() -> inputValidator.validateContainDivision("pobi,"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR);

    }

}

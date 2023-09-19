package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.validator.InputValidator;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputValidatorTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    private final InputValidator inputValidator = new InputValidator();

    @DisplayName("콤마이외의 특수문자가 있을 경우 예외 발생")
    @Test
    void specialCharactersException() {
        String input = "po|pi";

        assertThatThrownBy(() -> inputValidator.validateDelimiter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    @DisplayName("공백이 존재할 경우 예외 발생")
    @Test
    void spaceException() {
        String input = "po, pi";

        assertThatThrownBy(() -> inputValidator.validateDelimiter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    @DisplayName("숫자가 아닐 경우 예외 발생")
    @Test
    void nameLengthException() {
        String input = "o";

        assertThatThrownBy(() -> inputValidator.validateIsNumber(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}

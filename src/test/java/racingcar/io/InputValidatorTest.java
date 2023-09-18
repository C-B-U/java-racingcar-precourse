package racingcar.io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("입력값 검증에서")
class InputValidatorTest {

    private final InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("쉼표로 시작하는 입력값에 대해 예외를 던진다.")
    void validateCarsWithStartsWithComma() {
        Assertions.assertThatThrownBy(() -> inputValidator.validateCars(",pobi"))
                        .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("쉼표로 끝나는 입력값에 대해 예외를 던진다.")
    void validateCarsWithEndsWithComma() {
        Assertions.assertThatThrownBy(() -> inputValidator.validateCars("pobi,abc,"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("숫자가 아닌 값에 대해 예외를 던진다.")
    void validateTryCount() {
        Assertions.assertThatThrownBy(() -> inputValidator.validateTryCount("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

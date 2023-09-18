package racingcar.io;

import racingcar.constant.ErrorMessage;

public class InputValidator {
    private static final String CAR_DELIMITER = ",";

    public void validateCars(final String input) {
        if (input.startsWith(CAR_DELIMITER) || input.endsWith(CAR_DELIMITER)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_INPUT.getMessage());
        }
    }
}

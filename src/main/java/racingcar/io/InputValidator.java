package racingcar.io;

import racingcar.constant.ErrorMessage;

public class InputValidator {

    private static final String CAR_DELIMITER = ",";
    private static final Character MIN_NUMBER = '0';
    private static final Character MAX_NUMBER = '9';

    public void validateCars(final String input) {
        if (input.startsWith(CAR_DELIMITER) || input.endsWith(CAR_DELIMITER)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_INPUT.getMessage());
        }
    }

    public void validateTryCount(final String input) {
        if (input.chars().anyMatch(c -> MIN_NUMBER > c || c > MAX_NUMBER)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_TRY_COUNT_INPUT.getMessage());
        }
    }
}

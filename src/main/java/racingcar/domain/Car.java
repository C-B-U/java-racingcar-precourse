package racingcar.domain;

import racingcar.constant.ErrorMessage;

public class Car {
    private static final Integer MAX_SIZE = 5;
    private final String name;
    private int position = 0;

    public Car(final String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(final String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAME_LENGTH.getMessage());
        }
    }
}

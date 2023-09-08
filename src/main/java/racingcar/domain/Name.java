package racingcar.domain;

import racingcar.constant.ExceptionMessage;

public class Name {

    private static final int MAX_LENGTH = 5;
    private final String value;

    public Name(String value) {
        validateName(value);
        this.value = value;
    }

    private void validateName(String value) {
        if (value.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_LENGTH.toString());
        }
    }

    @Override
    public String toString() {
        return value;
    }
}

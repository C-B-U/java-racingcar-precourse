package racingcar.domain;

import racingcar.constant.ExceptionMessage;

public class TryCount {

    private static final int MIN_VALUE= 1;

    private final int value;

    public TryCount(int value) {
        validateRange(value);
        this.value = value;
    }

    public void validateRange(int value) {
        if (value < MIN_VALUE) {
            throw new IllegalArgumentException(ExceptionMessage.INVALID_TRY_COUNT_RANGE.toString());
        }
    }

    public int getValue() {
        return value;
    }
}

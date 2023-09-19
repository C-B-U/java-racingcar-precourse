package racingcar.constant;

public enum RandomNumber {

    START_RANGE(0),
    END_RANGE(9),
    CAN_MOVE_NUMBER(4);

    private final int value;

    RandomNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

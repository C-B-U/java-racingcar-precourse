package racingcar.constant;

public enum MoveStatus {
    MOVE, STOP;

    private static final Integer moveDivider = 4;

    public static MoveStatus getMoveStatus(final int randomNumber) {
        if (moveDivider <= randomNumber) {
            return MOVE;
        }
        return STOP;
    }

    public boolean isMove() {
        return this == MOVE;
    }
}

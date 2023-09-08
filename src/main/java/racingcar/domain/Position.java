package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.RandomNumber;

public class Position {

    private static final String RACING_LINE = "-";
    private int value = 0;

    public void move() {
        if (canMove()) {
            value += 1;
        }
    }

    private boolean canMove() {
        return pickRandomNumber() > RandomNumber.CAN_MOVE_NUMBER.getValue();
    }

    private int pickRandomNumber() {
        int start = RandomNumber.START_RANGE.getValue();
        int end = RandomNumber.END_RANGE.getValue();
        return Randoms.pickNumberInRange(start, end);
    }

    public boolean isSame(int maxPosition) {
        return value == maxPosition;
    }

    public int getPosition() {
        return value;
    }

    public String getValue() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < value; i++) {
            stringBuilder.append(RACING_LINE);
        }
        return stringBuilder.toString();
    }
}

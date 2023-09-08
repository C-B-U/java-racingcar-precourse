package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.RandomNumber;

public class Position {

    private final int value = 0;

    public void move() {

    }

    private int pickRandomNumber() {
        int start = RandomNumber.START_RANGE.getValue();
        int end = RandomNumber.END_RANGE.getValue();
        return Randoms.pickNumberInRange(start, end);
    }
}

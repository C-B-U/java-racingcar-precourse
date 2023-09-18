package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.MoveStatus;

public class RandomMoveGenerator {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 9;

    public MoveStatus generate() {
        final int randomNumber = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
        return MoveStatus.getMoveStatus(randomNumber);
    }
}

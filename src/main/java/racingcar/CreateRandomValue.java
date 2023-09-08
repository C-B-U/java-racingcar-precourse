package racingcar;


import camp.nextstep.edu.missionutils.Randoms;

public class CreateRandomValue {

    private static final int MIN_RANDOM_VALUE = 0;
    private static final int MAX_RANDOM_VALUE = 9;
    private static final int MIN_RANDOM_RANGE = 4;
    public static boolean canMoveCar() {
        int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
        return randomNumber >= MIN_RANDOM_RANGE;
    }
}
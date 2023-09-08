package racingcar;


import java.util.Random;

public class CreateRandomValue {

    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int MIN_RANDOM_VALUE = 4;
    private static final Random random = new Random();
    public static boolean canMoveCar() {
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
        return randomNumber >= MIN_RANDOM_VALUE;
    }
}
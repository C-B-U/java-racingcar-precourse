package racingcar.domain;

import racingcar.domain.message.ErrorMessage;

public class Car {
    private static final int MAXIMUM_NAME_LENGTH = 5;
    private static final int POSSIBLE_MOVE_NUMBER = 4;
    private final String name;
    private int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void validateName(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.OVER_MAXIMUM_LENGTH.toString());
        }
    }

    public void move(int number) {
        if (number >= POSSIBLE_MOVE_NUMBER) {
            this.position ++;
        }
    }
}

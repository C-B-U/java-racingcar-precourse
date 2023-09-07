package racingcar.domain;

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
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public void move(int number) {
        if (number >= POSSIBLE_MOVE_NUMBER) {
            this.position ++;
        }
    }
}

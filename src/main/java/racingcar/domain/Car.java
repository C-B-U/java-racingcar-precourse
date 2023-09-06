package racingcar.domain;

public class Car {
    private static final int MAXIMUM_NAME_LENGTH = 5;
    private final String name;
    private final int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > MAXIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    // 추가 기능 구현
}

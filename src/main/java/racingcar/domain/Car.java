package racingcar.domain;

import racingcar.constant.OutputMessage;

public class Car {
    private final Name name;
    private final Position position;

    public Car(Name name) {
        this.name = name;
        this.position = new Position();
    }

    public void race() {
        position.move();
    }

    public String getRacingResult() {
        return String.format(OutputMessage.RACING_RESULT.toString(), name.getValue(), position.getValue());
    }
}

package racingcar.domain.message;

public enum ProcessMessage {
    INPUT_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_NUM_ATTEMPTS("시도할 회수를 입력하세요.");

    private final String message;

    ProcessMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}

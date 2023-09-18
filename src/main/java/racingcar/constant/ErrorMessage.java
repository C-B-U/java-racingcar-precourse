package racingcar.constant;

public enum ErrorMessage {
    INVALID_CAR_INPUT("자동차 이름을 입력할 시 쉼표로 구분해야 합니다."),
    INVALID_CARS_NUM("자동차 이름에 중복이 있습니다.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX + this.message;
    }
}

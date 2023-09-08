package racingcar;

public enum ErrorMessage {
    NAME_DIVISION_ERROR("이름은 쉼표(,) 기준으로 구분합니다."),
    NAME_LENGTH_ERROR("자동차 이름이름은 5자 이하만 가능합니다.");

    private static final String ERROR = "[ERROR]";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR + message;
    }

}

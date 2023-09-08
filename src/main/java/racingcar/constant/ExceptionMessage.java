package racingcar.constant;

public enum ExceptionMessage {

    INVALID_LENGTH("이름은 5글자 이하로 입력해야합니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + message;
    }
}
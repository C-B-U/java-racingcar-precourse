package racingcar.constant;

public enum ExceptionMessage {

    INVALID_LENGTH("이름은 5글자 이하로 입력해야합니다."),
    INCORRECT_DELIMITER("','로 구분하여 입력해야합니다."),
    NOT_INTEGER("숫자로 입력해야 합니다."),
    INVALID_TRY_COUNT_RANGE("0이상의 숫자를 입력해야 합니다.");

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

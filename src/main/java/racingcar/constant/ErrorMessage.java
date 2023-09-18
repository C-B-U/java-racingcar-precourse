package racingcar.constant;

public enum ErrorMessage {
    INVALID_CAR_INPUT("자동차 이름을 입력할 시 쉼표로 구분해야 합니다."),
    INVALID_CARS_NUM("자동차 이름에 중복이 있습니다."),
    INVALID_CAR_NAME_LENGTH("자동차 이름의 길이가 잘못됐습니다."),
    INVALID_TRY_COUNT_INPUT("시도 회수의 입력값은 숫자만 가능합니다."),
    HAS_NO_MOVE_STATUS("다음 MoveStatus가 존재하지 않습니다."),
    INVALID_MOVE_STATUS_SIZE("MoveStatus의 개수가 잘못되었습니다.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX + this.message;
    }
}

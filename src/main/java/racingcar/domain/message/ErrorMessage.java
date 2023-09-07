package racingcar.domain.message;

import jdk.nashorn.internal.runtime.ECMAErrors;

public enum ErrorMessage {
    NAMES_SEPARATED_COMMA("이름은 콤마로 구문되어야 합니다."),
    HAS_BLANK("이름은 공백이 포함되면 안 됩니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + message;
    }
}

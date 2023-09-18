package racingcar.constant;

public enum GameMessage {
    CAR_INPUT_REQUEST("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    TRY_COUNT_REQUEST("시도할 회수는 몇회인가요?"),
    MOVE_RESULT("실행 결과"),
    WINNER_CARS("최종 우승자 : %s");

    private final String message;

    GameMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}

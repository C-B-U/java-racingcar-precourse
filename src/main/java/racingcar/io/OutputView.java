package racingcar.io;

import racingcar.constant.GameMessage;

public class OutputView {
    public void printCarRequest() {
        System.out.println(GameMessage.CAR_INPUT_REQUEST.getMessage());
    }

    public void printTryCountRequest() {
        System.out.println(GameMessage.TRY_COUNT_REQUEST.getMessage());
    }
}

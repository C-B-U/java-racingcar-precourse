package racingcar.view;

import racingcar.domain.message.ProcessMessage;

public class OutputView {
    public void printInputCarNames() {
        System.out.println(ProcessMessage.INPUT_CAR_NAMES);
    }

    public void printExceptionMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}

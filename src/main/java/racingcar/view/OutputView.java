package racingcar.view;

import racingcar.constant.OutputMessage;
import racingcar.domain.Names;

public class OutputView {

    public void printCarNames() {
        System.out.println(OutputMessage.READ_NAME);
    }

    public void printTryCount() {
        System.out.println(OutputMessage.READ_TRY_COUNT);
    }

    public void printResultMessage() {
        System.out.println(OutputMessage.RESULT_MESSAGE);
    }

    public void printRacingResult(String result) {
        System.out.println(result);
    }

    public void printWinner(Names names) {
        System.out.println(OutputMessage.WINNER + names.getElements());
    }
}

package racingcar.view;

import racingcar.constant.OutputMessage;
import racingcar.domain.Name;

import java.util.List;
import java.util.StringJoiner;

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

    public void printWinner(List<Name> names) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        names.forEach(name -> stringJoiner.add(name.getValue()));
        System.out.println(OutputMessage.WINNER + stringJoiner.toString());
    }
}

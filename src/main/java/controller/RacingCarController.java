package controller;

import racingcar.domain.Name;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCarController {

    OutputView outputView = new OutputView();
    InputView inputView = new InputView();

    public void start() {
        List<Name> names = readNames();
        int tryCount = readTryCount();
    }

    private List<Name> readNames() {
        outputView.printCarNames();
        return inputView.readNames();
    }

    private int readTryCount() {
        outputView.printTryCount();
        return inputView.readTryCount();
    }
}

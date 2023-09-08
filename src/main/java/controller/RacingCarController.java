package controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCarController {

    OutputView outputView = new OutputView();
    InputView interView = new InputView();

    public void start() {
        outputView.printCarNames();
        List<String> names = interView.readNames();
    }
}

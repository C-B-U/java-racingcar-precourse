package controller;

import racingcar.view.OutputView;

public class RacingCarController {

    OutputView outputView = new OutputView();

    public void start() {
        outputView.printCarNames();
    }
}

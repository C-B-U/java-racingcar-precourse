package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    private final OutputView outputView = new OutputView();

    public void start() {
        outputView.printInputCarNames();
    }
}

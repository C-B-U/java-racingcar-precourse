package racingcar.controller;

import racingcar.domain.Car;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printInputCarNames();
        List<Car> cars = inputView.inputCarNames();
        outputView.printInputNumberOfAttempts();
        int attempts = inputView.inputNumberOfAttempts();
    }
}

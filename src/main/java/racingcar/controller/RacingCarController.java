package racingcar.controller;

import racingcar.domain.Names;
import racingcar.domain.TryCount;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private CarService carService;

    public void run() {
        carService = new CarService(readNames());
        TryCount tryCount = readTryCount();
        startRacing(tryCount);
    }

    private Names readNames() {
        outputView.printCarNames();
        Names names = inputView.readNames();
        outputView.printNewLine();
        return names;
    }

    private TryCount readTryCount() {
        outputView.printTryCount();
        TryCount tryCount = inputView.readTryCount();
        outputView.printNewLine();
        return tryCount;
    }

    private void startRacing(TryCount tryCount) {
        outputView.printResultMessage();
        for (int i = 0; i < tryCount.getValue(); i++) {
            outputView.printRacingResult(carService.race());
        }
        outputView.printWinner(carService.getWinner());
    }
}

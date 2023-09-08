package controller;

import racingcar.domain.Name;
import racingcar.service.CarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCarController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final CarService carService = new CarService();

    public void start() {
        carService.addCars(readNames());
        int tryCount = readTryCount();
        outputView.printResultMessage();
        for (int i = 0; i < tryCount; i++) {
            outputView.printRacingResult(carService.race());
        }
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

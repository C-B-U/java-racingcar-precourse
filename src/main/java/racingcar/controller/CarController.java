package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.domain.TryCount;
import racingcar.domain.WinnerCars;
import racingcar.io.InputManager;
import racingcar.io.OutputView;
import racingcar.service.CarService;

public class CarController {

    private final InputManager inputManager = new InputManager();
    private final OutputView outputView = new OutputView();
    private final CarService carService = new CarService();

    public void play() {
        createCars();
        createTryCount();
        moveCars();
        findWinnerCars();
    }

    private void moveCars() {
        final TryCount tryCount = carService.findTryCount();

        while(tryCount.hasNext()) {
            final String currentDirection = carService.move();
            outputView.printCurrentDirection(currentDirection);
        }
    }

    private void findWinnerCars() {
        final String winnerCars = carService.findWinnerCars();
        outputView.printWinnerCars(winnerCars);
    }

    private void createTryCount() {
        outputView.printTryCountRequest();
        final TryCount tryCount = inputManager.readTryCount();
        carService.saveTryCount(tryCount);
    }

    private void createCars() {
        outputView.printCarRequest();
        final Cars cars = inputManager.readCars();
        carService.saveCars(cars);
    }
}

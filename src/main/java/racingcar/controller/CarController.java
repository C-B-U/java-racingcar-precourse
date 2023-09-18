package racingcar.controller;

import racingcar.domain.Cars;
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
    }

    private void createTryCount() {
        outputView.printTryCountRequest();
    }

    private void createCars() {
        outputView.printCarRequest();
        final Cars cars = inputManager.readCars();
        carService.saveCars(cars);
    }
}

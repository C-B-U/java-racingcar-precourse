package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.generator.RandomNumberGenerator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public void start() {
        outputView.printInputCarNames();
        List<Car> cars = inputView.inputCarNames();
        outputView.printInputNumberOfAttempts();
        int attempts = inputView.inputNumberOfAttempts();
        process(cars, attempts);
    }

    private void process(List<Car> cars, int attempts) {
        outputView.printProcessResultMessage();
        for (int i = 0; i < attempts; i++) {
            processRacing(cars);
            outputView.printNewLine();
        }
    }

    private void processRacing(List<Car> cars) {
        cars.forEach(car -> {
            car.move(randomNumberGenerator.generate());
            outputView.printRacingRecord(car);
        });
    }
}

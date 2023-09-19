package racingcar.service;

import racingcar.domain.Cars;
import racingcar.domain.Names;

public class CarService {

    private final Cars cars;

    public CarService(Names names) {
        this.cars = new Cars(names);
    }

    public String race() {
        cars.race();
        return cars.getRacingResult();
    }

    public Names getWinner() {
        return cars.getWinner();
    }
}

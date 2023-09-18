package racingcar.repository;

import racingcar.domain.Cars;

public class CarRepository {

    private Cars cars;

    public void saveCars(final Cars cars) {
        this.cars = cars;
    }
}

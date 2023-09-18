package racingcar.service;

import racingcar.domain.Cars;
import racingcar.repository.CarRepository;

public class CarService {
    private final CarRepository carRepository = new CarRepository();

    public void saveCars(final Cars cars) {
        carRepository.saveCars(cars);
    }
}

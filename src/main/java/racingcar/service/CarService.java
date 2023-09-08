package racingcar.service;

import racingcar.domain.Cars;
import racingcar.domain.Name;

import java.util.List;

public class CarService {

    private Cars cars;

    public void addCars(List<Name> names) {
        cars = new Cars(names);
    }

    public void race(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            cars.race();
        }
    }
}

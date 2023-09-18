package racingcar.domain;

import racingcar.constant.ErrorMessage;

import java.util.HashSet;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        validateUnique(cars);
        this.cars = cars;
    }

    private void validateUnique(final List<Car> cars) {
        if (new HashSet<>(cars).size() != cars.size()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CARS_NUM.getMessage());
        }
    }
}

package racingcar.domain;

import racingcar.constant.ErrorMessage;
import racingcar.constant.MoveStatus;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(final List<Car> cars) {
        validateUnique(cars);
        this.cars = Collections.unmodifiableList(cars);
    }

    private void validateUnique(final List<Car> cars) {
        if (new HashSet<>(cars).size() != cars.size()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CARS_NUM.getMessage());
        }
    }

    public Integer getNumberOfCars() {
        return cars.size();
    }

    public void moveAll(final MoveStatuses moveStatuses) {
        cars.forEach(car -> move(car, moveStatuses.getNext()));
    }

    private void move(final Car car, final MoveStatus moveStatus) {
        car.move(moveStatus);
    }

    public String findWinners() {
        return null;
    }

    public String getCurrentDirection() {
        return null;
    }
}

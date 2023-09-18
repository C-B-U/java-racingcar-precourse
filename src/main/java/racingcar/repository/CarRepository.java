package racingcar.repository;

import racingcar.domain.Cars;
import racingcar.domain.TryCount;

public class CarRepository {

    private Cars cars;
    private TryCount tryCount;

    public void saveCars(final Cars cars) {
        this.cars = cars;
    }

    public void saveTryCount(final TryCount tryCount) {
        this.tryCount = tryCount;
    }

    public TryCount findTryCount() {
        return this.tryCount;
    }

    public Cars findCars() {
        return this.cars;
    }
}

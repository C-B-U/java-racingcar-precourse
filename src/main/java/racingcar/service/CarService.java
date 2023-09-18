package racingcar.service;

import racingcar.domain.Cars;
import racingcar.domain.MoveStatuses;
import racingcar.domain.TryCount;
import racingcar.repository.CarRepository;
import racingcar.utils.RandomMoveGenerator;

public class CarService {

    private final CarRepository carRepository = new CarRepository();
    private final RandomMoveGenerator randomMoveGenerator = new RandomMoveGenerator();

    public void saveCars(final Cars cars) {
        carRepository.saveCars(cars);
    }

    public void saveTryCount(final TryCount tryCount) {
        carRepository.saveTryCount(tryCount);
    }

    public TryCount findTryCount() {
        return carRepository.findTryCount();
    }

    public String move() {
        final Cars cars = carRepository.findCars();
        final MoveStatuses moveStatuses = randomMoveCars(cars.getNumberOfCars());
        cars.moveAll(moveStatuses);
        return cars.getCurrentDirection();
    }

    private MoveStatuses randomMoveCars(final Integer numberOfCars) {
        return randomMoveGenerator.generate(numberOfCars);
    }

    public String findWinnerCars() {
        return carRepository.findCars().findWinners();
    }
}

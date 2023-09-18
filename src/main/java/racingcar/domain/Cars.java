package racingcar.domain;

import racingcar.constant.ErrorMessage;
import racingcar.constant.MoveStatus;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private static final Integer MIN_POSITION = 0;
    private static final String WINNER_DELIMITER = ", ";
    private static final String NEW_LINE_DELIMITER = "\n";
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
        validateMoveStatusSize(moveStatuses);
        cars.forEach(car -> move(car, moveStatuses.getNext()));
    }

    private void validateMoveStatusSize(final MoveStatuses moveStatuses) {
        if (cars.size() != moveStatuses.getSize()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_MOVE_STATUS_SIZE.getMessage());
        }
    }

    private void move(final Car car, final MoveStatus moveStatus) {
        car.move(moveStatus);
    }

    public String findWinners() {
        final int maxPosition = getMaxPosition();
        return cars.stream()
                .filter(car -> car.hasMaxPosition(maxPosition))
                .map(Car::getName)
                .collect(Collectors.joining(WINNER_DELIMITER));
    }

    private int getMaxPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(MIN_POSITION);
    }

    public String getCurrentDirection() {
        return cars.stream()
                .map(Car::getCurrentStatus)
                .collect(Collectors.joining(NEW_LINE_DELIMITER)) + NEW_LINE_DELIMITER;
    }
}

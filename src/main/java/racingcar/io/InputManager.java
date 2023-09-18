package racingcar.io;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.TryCount;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InputManager {

    private static final String CAR_DELIMITER = ",";
    private final InputView inputView = new InputView();

    public Cars readCars() {
        return read(() -> {
            final List<Car> cars = Arrays.stream(inputView.readCars().split(CAR_DELIMITER)).map(Car::new).collect(Collectors.toList());
            return new Cars(cars);
        });
    }

    public TryCount readTryCount() {
        return read(() -> new TryCount(Integer.parseInt(inputView.readTryCount())));
    }

    private <T> T read(final Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (final IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WinningCar {
    private final List<Car> winning;

    public WinningCar(List<Car> cars) {
        this.winning = selectWinningCar(cars);
    }

    private List<Car> selectWinningCar(List<Car> cars) {
        int max = cars.stream()
                .mapToInt(Car::getPosition)
                .max().getAsInt();
        return cars.stream().filter(car -> car.getPosition() >= max).collect(Collectors.toList());
    }

    public List<Car> getWinningCar() {
        return new ArrayList<>(winning);
    }
}

package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(List<Name> names) {
        names.forEach(name -> cars.add(new Car(name)));
    }

    public void race() {
        cars.forEach(Car::race);
    }

    public String getRacingResult() {
        StringBuilder stringBuilder = new StringBuilder();
        cars.forEach(car ->
                stringBuilder.append(car.getRacingResult())
                        .append("\n")
        );
        return stringBuilder.toString();
    }

    public List<Name> getWinner() {
        int maxPosition = calculateMaxPosition();
        return cars.stream()
                .filter(car -> car.isWinner(maxPosition))
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    public int calculateMaxPosition() {
        List<Integer> positions = cars.stream()
                .map(Car::getPosition)
                .mapToInt(Position::getPosition)
                .boxed()
                .collect(Collectors.toList());
        return Collections.max(positions);
    }
}

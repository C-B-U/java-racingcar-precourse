package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

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
}

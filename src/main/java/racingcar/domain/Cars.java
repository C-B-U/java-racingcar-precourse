package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(List<Name> names) {
        names.forEach(name -> cars.add(new Car(name)));
        System.out.println(cars);
    }
}

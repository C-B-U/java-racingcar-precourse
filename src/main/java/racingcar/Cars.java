package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    private static final String DIVISION = ",";
    private final List<Car> cars = new ArrayList<>();

    public void addCars(String name){
       Set<String> carNames = Arrays.stream(name.split(DIVISION)).collect(Collectors.toSet());
       carNames.stream().map(Car::new).forEach(cars::add);
    }

    public void moveCars(){
        cars.forEach(car -> {
            if (CreateRandomValue.canMoveCar()) {
                car.movePosition();
            }
        });
    }

    public String executionResult(){
        return cars.stream()
                .map(car -> car.makeScreen(new StringBuilder()))
                .reduce(new StringBuilder(), StringBuilder::append)
                .toString();
    }

    public String finalWinner(){
        List<String> winCars = getWinCarNames();

        if (winCars.size() > 1) {
            return String.join(", ", winCars);
        }
        return winCars.get(0);
    }

    private List<String> getWinCarNames() {
        return cars.stream()
                .filter(car -> car.getPosition() == maxPosition())
                .map(Car::getName)
                .collect(Collectors.toList());
    }

    private int maxPosition(){
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

}

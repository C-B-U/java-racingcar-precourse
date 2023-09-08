package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {

    private static final int OVER_ONE_WINNER = 1;
    private static final int ONLY_ONE_WINNER = 0;
    private static final int DEFAULT_POSITION = 0;
    private static final String DIVISION = ",";
    private static final String WINNER_DELIMITER = ", ";
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

        if (winCars.size() > OVER_ONE_WINNER) {
            return String.join(WINNER_DELIMITER, winCars);
        }
        return winCars.get(ONLY_ONE_WINNER);
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
                .orElse(DEFAULT_POSITION);
    }

}

package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.WinningCar;
import racingcar.domain.message.ProcessMessage;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private static final String COLON = " : ";
    private static final String COMMA = ", ";
    private static final String MOVING = "-";

    public void printNewLine() {
        System.out.println();
    }

    public void printInputCarNames() {
        System.out.println(ProcessMessage.INPUT_CAR_NAMES);
    }

    public void printExceptionMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    public void printInputNumberOfAttempts() {
        printNewLine();
        System.out.println(ProcessMessage.INPUT_NUM_ATTEMPTS);
    }

    public void printProcessResultMessage() {
        printNewLine();
        System.out.println(ProcessMessage.PROCESS_RESULT);
    }

    public void printRacingRecord(Car car) {
        System.out.print(car.getName() + COLON);
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print(MOVING);
        }
        printNewLine();
    }

    public void printWinnerMessage() {
        System.out.print(ProcessMessage.WINNER_MESSAGE + COLON);
    }

    public void printWinner(List<Car> cars) {
        System.out.println(cars.stream().map(Car::getName).collect(Collectors.joining(COMMA)));
    }
}

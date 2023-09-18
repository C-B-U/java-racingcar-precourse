package racingcar.io;

import racingcar.constant.GameMessage;
import racingcar.domain.Cars;

public class OutputView {
    public void printCarRequest() {
        System.out.println(GameMessage.CAR_INPUT_REQUEST.getMessage());
    }

    public void printTryCountRequest() {
        System.out.println(GameMessage.TRY_COUNT_REQUEST.getMessage());
    }

    public void printMoveResult() {
        System.out.println(GameMessage.MOVE_RESULT.getMessage());
    }

    public void printCurrentDirection(final String currentDirection) {
        System.out.println(currentDirection);
    }

    public void printWinnerCars(final String winnerCars) {
        System.out.println(String.format(GameMessage.WINNER_CARS.getMessage(), winnerCars));
    }
}

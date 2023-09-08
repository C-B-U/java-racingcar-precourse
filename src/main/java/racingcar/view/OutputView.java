package racingcar.view;

import racingcar.constants.ProgressMessage;
import racingcar.domain.Cars;

public class OutputView {
    public void printErrorMessage(String message) {
        System.out.println(message);
    }

    public void printInputCarNames(){
        System.out.println(ProgressMessage.INPUT_CAR_NAMES);
    }

    public void printInputTryCount(){
        System.out.println(ProgressMessage.INPUT_TRY_COUNT);
    }

    public void printExecuteResult(){
        System.out.println(ProgressMessage.EXECUTE_RESULT);
    }

    public void printCarsStatus(Cars cars){
        System.out.println(cars.executionResult());
    }

    public void printFinalWinner(Cars cars){
        System.out.print(ProgressMessage.FINAL_WINNER);
        System.out.println(cars.finalWinner());
    }

    public void printEnter(){
        System.out.println();
    }
}

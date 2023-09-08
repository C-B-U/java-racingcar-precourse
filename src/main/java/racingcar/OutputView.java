package racingcar;

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
}

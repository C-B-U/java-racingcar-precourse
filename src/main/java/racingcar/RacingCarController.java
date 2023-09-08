package racingcar;

public class RacingCarController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RacingCarService racingCarService;

    public RacingCarController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.racingCarService = new RacingCarService();
    }

    public void run(){
        Cars cars = inputView.readCarNames();
        int tryCount = inputView.readTryCount();

        outputView.printExecuteResult();
        changeCarsStatus(cars, tryCount);
    }

    private void changeCarsStatus(Cars cars, int tryCount) {
        for (int i = 0; i < tryCount; i++){
            racingCarService.moveCars(cars);
            outputView.printCarsStatus(cars);
        }
    }
}
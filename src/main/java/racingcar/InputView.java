package racingcar;

import java.util.function.Supplier;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final OutputView outputView = new OutputView();
    public final InputValidator inputValidator = new InputValidator();

    public Cars readCarNames(){
        return read(() -> {
            outputView.printInputCarNames();
            String names = Console.readLine();
            inputValidator.validateContainDivision(names);
            Cars cars = new Cars();
            cars.addCars(names);
            return cars;
        });
    }

    public int readTryCount(){
        return read(() ->{
            outputView.printInputTryCount();
            String count = Console.readLine();
            outputView.printEnter();
            inputValidator.validateTryCount(count);
            return Integer.parseInt(count);
        });
    }

    private <T> T read(Supplier<T> supplier){
        while (true){
            try{
                return supplier.get();
            }catch (IllegalArgumentException e){
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }
}

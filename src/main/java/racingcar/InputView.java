package racingcar;

import java.util.Scanner;
import java.util.function.Supplier;

public class InputView {

    private final OutputView outputView = new OutputView();
    public final InputValidator inputValidator = new InputValidator();
    private final Scanner scan = new Scanner(System.in);

    public Cars readCarNames(){
        return read(() -> {
            outputView.printInputCarNames();
            String names = scan.next();
            inputValidator.validateContainDivision(names);
            Cars cars = new Cars();
            cars.addCars(names);
            return cars;
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

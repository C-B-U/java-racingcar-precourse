package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.validator.InputValidator;

import java.util.List;

public class InputView {
    private final InputValidator inputValidator = new InputValidator();
    private final OutputView outputView = new OutputView();

    public List<Car> inputCarNames() {
        try {
            String names = Console.readLine();
            return new Cars(names).getCars();
        } catch (IllegalArgumentException e) {
            outputView.printExceptionMessage(e);
            return inputCarNames();
        }
    }

    public int inputNumberOfAttempts() {
        try {
            String attempts = Console.readLine();
            inputValidator.validateIsDigit(attempts);
            return Integer.parseInt(attempts);
        } catch (IllegalArgumentException e) {
            outputView.printExceptionMessage(e);
            return inputNumberOfAttempts();
        }
    }
}

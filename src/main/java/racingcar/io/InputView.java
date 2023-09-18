package racingcar.io;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();


    public String readCars() {
        final String input = Console.readLine();
        inputValidator.validateCars(input);
        return input;
    }
}

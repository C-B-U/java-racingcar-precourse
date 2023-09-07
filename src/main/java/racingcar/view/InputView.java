package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class InputView {
    private final OutputView outputView = new OutputView();

    public List<Car> inputCarNames() {
        try {
            String names = Console.readLine();
            return new Cars().convert(names);
        } catch (IllegalArgumentException e) {
            outputView.printExceptionMessage(e);
            return inputCarNames();
        }
    }
}

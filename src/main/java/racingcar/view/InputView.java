package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Name;
import racingcar.domain.Names;
import racingcar.domain.TryCount;
import racingcar.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InputView {

    private static final String NAMES_REGEX = ",";

    private final InputValidator inputValidator = new InputValidator();

    public Names readNames() {
        return attemptedInput(() -> {
            String input = Console.readLine();
            inputValidator.validateDelimiter(input);
            List<Name> names = Arrays.stream(input.split(NAMES_REGEX))
                    .map(Name::new)
                    .collect(Collectors.toList());
            return new Names(names);
        });
    }

    public TryCount readTryCount() {
        return attemptedInput(() -> {
            String input = Console.readLine();
            inputValidator.validateIsNumber(input);
            return new TryCount(Integer.parseInt(input));
        });
    }

    private <T> T attemptedInput(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return supplier.get();
        }
    }
}

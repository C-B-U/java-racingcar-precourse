package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Name;
import racingcar.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String NAMES_REGEX = ",";

    private final InputValidator inputValidator = new InputValidator();

    public List<Name> readNames() {
        String names = Console.readLine();
        inputValidator.validateDelimiter(names);
        return Arrays.stream(names.split(NAMES_REGEX))
                .map(Name::new)
                .collect(Collectors.toList());
    }

    public int readTryCount() {
        return Integer.parseInt(Console.readLine());
    }
}

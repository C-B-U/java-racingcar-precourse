package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String NAMES_REGEX = ",";

    public List<String> readNames() {
        String names = Console.readLine();
        return Arrays.stream(names.split(NAMES_REGEX))
                .collect(Collectors.toList());
    }
}

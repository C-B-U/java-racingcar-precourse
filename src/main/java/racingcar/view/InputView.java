package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Name;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    private static final String NAMES_REGEX = ",";

    public List<Name> readNames() {
        String names = Console.readLine();
        return Arrays.stream(names.split(NAMES_REGEX))
                .map(Name::new)
                .collect(Collectors.toList());
    }

    public int readTryCount() {
        return Integer.parseInt(Console.readLine());
    }
}

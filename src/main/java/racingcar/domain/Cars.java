package racingcar.domain;

import racingcar.domain.message.ErrorMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private static final String BLANK = " ";
    private static final String COMMA = ",";

    private List<Car> cars = new ArrayList<>();

    public Cars(String names) {
        validateNames(names);
        this.cars = convert(names);
    }

    public List<Car> convert(String names) {
        validateNames(names);
        return Arrays.stream(names.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    private void validateNames(String names) {
        validateHasBlank(names);
        validateIsSeparatedByComma(names);
    }

    private void validateIsSeparatedByComma(String names) {
        if (names.endsWith(COMMA)) {
            throw new IllegalArgumentException(ErrorMessage.NAMES_SEPARATED_COMMA.toString());
        }
    }

    private void validateHasBlank(String names) {
        if (names.contains(BLANK)) {
            throw new IllegalArgumentException(ErrorMessage.HAS_BLANK.toString());
        }
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}

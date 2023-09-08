package racingcar;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class InputValidator {

    private static final int MIN_TRY_COUNT = 1;
    private static final int MIN_NAME_SIZE = 2;
    private static final String DIVISION = ",";

    public void validateContainDivision(String name) {
        Set<String> carNames = Arrays.stream(name.split(DIVISION)).collect(Collectors.toSet());
        if(carNames.size() < MIN_NAME_SIZE){
            throw new IllegalArgumentException(ErrorMessage.NAME_DIVISION_ERROR.getMessage());
        }
    }

    public void validateTryCount(int count) {
        if (count < MIN_TRY_COUNT){
            throw new IllegalArgumentException(ErrorMessage.TRY_COUNT_ERROR.getMessage());
        }
    }
}

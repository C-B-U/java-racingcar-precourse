package racingcar;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class InputValidator {

    private static final int MIN_TRY_COUNT = 1;
    private static final int MIN_NAME_SIZE = 2;
    private static final String DIVISION = ",";
    private static final String NUMERIC_REGEX = "^\\d*$";

    public void validateContainDivision(String name) {
        Set<String> carNames = Arrays.stream(name.split(DIVISION)).collect(Collectors.toSet());
        if(carNames.size() < MIN_NAME_SIZE){
            throw new IllegalArgumentException(ErrorMessage.NAME_DIVISION_ERROR.getMessage());
        }
    }

    public void validateTryCount(String count) {
        validateNumeric(count);
        if (Integer.parseInt(count) < MIN_TRY_COUNT){
            throw new IllegalArgumentException(ErrorMessage.TRY_COUNT_ERROR.getMessage());
        }
    }

    private void validateNumeric(String count){
        if (!count.matches(NUMERIC_REGEX)){
            throw new IllegalArgumentException(ErrorMessage.INPUT_NUMERIC_ERROR.getMessage());
        }
    }
}

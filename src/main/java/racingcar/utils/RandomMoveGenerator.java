package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.constant.MoveStatus;
import racingcar.domain.MoveStatuses;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomMoveGenerator {

    private static final int START_INDEX = 0;
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 9;

    public MoveStatuses generate(final Integer numberOfCars) {
        return new MoveStatuses(IntStream.range(START_INDEX, numberOfCars)
                .mapToObj(i -> generate())
                .collect(Collectors.toList()));
    }

    private MoveStatus generate() {
        final int randomNumber = Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
        return MoveStatus.getMoveStatus(randomNumber);
    }
}

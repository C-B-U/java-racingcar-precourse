package racingcar.domain;

import racingcar.constant.ErrorMessage;
import racingcar.constant.MoveStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoveStatuses {
    private static final int REMOVE_INDEX = 0;
    private final List<MoveStatus> moveStatuses;

    public MoveStatuses(final List<MoveStatus> moveStatuses) {
        this.moveStatuses = new ArrayList<>(moveStatuses);
    }

    public MoveStatus getNext() {
        validateHasNext();
        return moveStatuses.remove(REMOVE_INDEX);
    }

    private void validateHasNext() {
        if (moveStatuses.isEmpty()) {
            throw new IllegalStateException(ErrorMessage.HAS_NO_MOVE_STATUS.getMessage());
        }
    }
}

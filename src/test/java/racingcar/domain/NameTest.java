package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @DisplayName("이름의 길이가 5가 넘어갈 경우 예외가 발생한다.")
    @Test
    void nameLengthException() {
        String name = "김연진김연진";

        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}

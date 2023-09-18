package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.constant.MoveStatus;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Car를 가지는 일급 컬렉션에서")
class CarsTest {

    @Test
    @DisplayName("생성시 같은 name의 car가 존재하면 예외를 던진다.")
    void create() {
        Assertions.assertThatThrownBy(() -> new Cars(Arrays.asList(new Car("a"), new Car("a"))))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Car와 MoveStatus의 개수가 상이할 시 예외를 던진다.")
    void moveAll() {
        final Cars cars = new Cars(Arrays.asList(new Car("a"), new Car("b")));
        Assertions.assertThatThrownBy(() -> cars.moveAll(new MoveStatuses(Arrays.asList(MoveStatus.MOVE, MoveStatus.STOP, MoveStatus.MOVE))))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("우승차 조회가 수행되는가")
    void findWinners() {
        //given
        final String winner = "a";
        final Cars cars = new Cars(Arrays.asList(new Car(winner), new Car("b")));
        cars.moveAll(new MoveStatuses(Arrays.asList(MoveStatus.MOVE, MoveStatus.STOP)));

        //when
        final String winnerString = cars.findWinners();

        //then
        Assertions.assertThat(winnerString).isEqualTo(winner);
    }
}

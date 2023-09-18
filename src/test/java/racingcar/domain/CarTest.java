package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.constant.MoveStatus;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Car 도메인에서")
class CarTest {

    @Test
    @DisplayName("이름의 길이가 5를 초과하는 경우 예외를 던진다.")
    void create() {
        Assertions.assertThatThrownBy(() -> new Car("asdfasdf"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("MoveStatus의 상태에 따라 움직인다.")
    void move() {
        //given
        final Car car = new Car("aaa");
        final Integer olderPosition = car.getPosition();

        //when
        car.move(MoveStatus.STOP);
        car.move(MoveStatus.MOVE);

        //then
        Assertions.assertThat(car.getPosition()).isNotEqualTo(olderPosition);
    }
}

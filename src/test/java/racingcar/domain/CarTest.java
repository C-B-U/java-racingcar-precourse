package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CarTest {
    @Test
    @DisplayName("5글자 초과의 이름은 예외가 발생한다.")
    void carNameTest1() {
        String name = "일이삼사오육";
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new Car(name));
        assertThat(e.getMessage()).isEqualTo("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
    }

    @Test
    @DisplayName("4 이상의 무작위 값은 포지션을 1 올린다.")
    void carNameTest2() {
        Car car = new Car("일이삼사");
        car.move(6);
        car.move(7);
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    @DisplayName("4 미만의 무작위 값은 포지션을 올리지 못한다.")
    void carNameTest3() {
        Car car = new Car("일이삼사");
        car.move(1);
        car.move(2);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
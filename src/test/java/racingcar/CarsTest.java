package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars();
        cars.addCars("pobi,woni,jun");
        cars.moveCars();
    }

    @Test
    @DisplayName("자동차를 추가했을 때 차를 움직이면 실행결과에 이름이 나타난다.")
    void showCarScreen(){
        cars.addCars("pobi,woni,jun");
        cars.moveCars();

        String screen = cars.executionResult();

        assertThat(screen).containsAnyOf("pobi :", "woni :", "jun :");
    }

    @Test
    @DisplayName("게임에서 이긴 최종 우승자의 이름을 나타난다.")
    void showWinCarNames(){
        cars.addCars("pobi,woni,jun");
        cars.moveCars();

        String names = cars.finalWinner();
        assertThat(names).containsAnyOf("pobi", "woni", "jun");
    }
}

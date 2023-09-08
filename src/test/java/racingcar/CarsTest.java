package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CarsTest {

    Cars cars = new Cars();

    @Test
    @DisplayName("자동차를 추가했을 때 차를 움직이면 실행결과에 이름이 나타난다.")
    void showCarScreen(){
        cars.addCars("pobi,woni,jun");
        cars.moveCars();

        String screen = cars.executionResult();

        assertThat(screen).containsOnlyOnce("pobi :");
        assertThat(screen).containsOnlyOnce("woni :");
        assertThat(screen).containsOnlyOnce("jun :");
    }
}

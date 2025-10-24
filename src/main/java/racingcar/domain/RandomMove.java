package racingcar.domain;

import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;
import static racingcar.common.Constants.MINIMUM_MOVE_VALUE;

public class RandomMove {
    private Racingcars racingcars;

    public RandomMove(Racingcars racingcars) {
        this.racingcars = racingcars;
    }

    public void doTrial() {
        List<Racingcar> racingcarList = racingcars.getRacingcarList();
        for (Racingcar racingcar : racingcarList) {
            moveByRandomValue(racingcar);
        }
    }

    private void moveByRandomValue(Racingcar racingcar) {
        int randomValue;
        randomValue = pickNumberInRange(0, 9);
        if (randomValue >= MINIMUM_MOVE_VALUE) {
            racingcar.moveForward();
        }
    }
}

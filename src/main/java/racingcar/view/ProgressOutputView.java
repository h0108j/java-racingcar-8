package racingcar.view;

import racingcar.domain.Racingcar;
import racingcar.domain.Racingcars;

import static racingcar.common.Constants.RACINGCAR_MOVE_MARK;

public class ProgressOutputView implements ProgressObserver {
    @Override
    public void readyProgress() {
        System.out.println("\n실행 결과");
    }

    @Override
    public void printProgress(Racingcars racingcars) {
        for (Racingcar racingcar : racingcars.getRacingcarList()) {
            System.out.println(racingcar.getCarName() + " : " + RACINGCAR_MOVE_MARK.repeat(racingcar.getMoveCount()));
        }
        System.out.println();
    }
}

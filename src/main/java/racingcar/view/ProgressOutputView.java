package racingcar.view;

import racingcar.domain.Racingcar;
import racingcar.domain.Racingcars;

public class ProgressOutputView implements ProgressObserver {
    @Override
    public void printProgress(Racingcars racingcars) {
        System.out.println("실행결과");
        for (Racingcar racingcar : racingcars.getRacingcarList()) {
            System.out.print(racingcar.getCarName() + " : ");
            printMoveCount(racingcar);
        }
    }

    private void printMoveCount(Racingcar racingcar) {
        for (int i = 0; i < racingcar.getMoveCount(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

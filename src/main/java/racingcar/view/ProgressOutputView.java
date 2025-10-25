package racingcar.view;

import racingcar.domain.Racingcar;
import racingcar.domain.Racingcars;

public class ProgressOutputView implements ProgressObserver {
    @Override
    public void readyProgress() {
        System.out.println("\n실행 결과");
    }

    @Override
    public void printProgress(Racingcars racingcars) {
        for (Racingcar racingcar : racingcars.getRacingcarList()) {
            System.out.print(racingcar.getCarName() + " : ");
            printMoveCount(racingcar);
        }
        System.out.println();
    }

    private void printMoveCount(Racingcar racingcar) {
        for (int i = 0; i < racingcar.getMoveCount(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

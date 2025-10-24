package racingcar.view;

import racingcar.domain.Racingcars;

public interface ProgressObserver {
    public void printProgress(Racingcars racingcars);
}

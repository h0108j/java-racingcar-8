package racingcar.view;

import racingcar.domain.Racingcars;

public interface ProgressObserver {
    void readyProgress();
    void printProgress(Racingcars racingcars);
}

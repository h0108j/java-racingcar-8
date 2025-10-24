package racingcar.domain;

import racingcar.view.ProgressObserver;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<ProgressObserver> progressObservers;
    private final int totalTrialCount;
    private int currentTrialCount;
    private Racingcars racingcars;

    public Race(int totalTrialCount, Racingcars racingcars) {
        this.totalTrialCount = totalTrialCount;
        this.racingcars = racingcars;
        this.progressObservers = new ArrayList<>();
        this.currentTrialCount = 0;
    }

    public void start() {
        moveRacingcars();
    }

    private void moveRacingcars() {
        RandomMove randomMove = new RandomMove(racingcars);
        while (currentTrialCount < totalTrialCount) {
            randomMove.doTrial();
            updateProgress();
            currentTrialCount++;
        }
    }

    public void addProgressObserver(ProgressObserver progressObserver) {
        progressObservers.add(progressObserver);
    }

    private void updateProgress() {
        for (ProgressObserver progressObserver : progressObservers) {
            progressObserver.printProgress(racingcars);
        }
    }
}

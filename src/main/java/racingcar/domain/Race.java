package racingcar.domain;

import racingcar.common.validator.TrialCountValidator;
import racingcar.common.validator.Validator;
import racingcar.view.ProgressObserver;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<ProgressObserver> progressObservers;
    private final int totalTrialCount;
    private Racingcars racingcars;
    private List<Racingcar> winnerList;
    private Validator validator = new TrialCountValidator();

    public Race(int totalTrialCount, Racingcars racingcars) {
        validator.validate(totalTrialCount);
        this.totalTrialCount = totalTrialCount;
        this.racingcars = racingcars;
        this.progressObservers = new ArrayList<>();
    }

    public void start() {
        moveRacingcars();
        WinnerDecider winnerDecider = new WinnerDecider(racingcars);
        winnerList = winnerDecider.getWinner();
    }

    private void moveRacingcars() {
        RandomMove randomMove = new RandomMove(racingcars);
        readyProgress();
        for (int currentTrialCount = 0; currentTrialCount < totalTrialCount;  currentTrialCount++) {
            randomMove.doTrial();
            updateProgress();
        }
    }

    public void addProgressObserver(ProgressObserver progressObserver) {
        progressObservers.add(progressObserver);
    }

    private void readyProgress() {
        for (ProgressObserver progressObserver : progressObservers) {
            progressObserver.readyProgress();
        }
    }

    private void updateProgress() {
        for (ProgressObserver progressObserver : progressObservers) {
            progressObserver.printProgress(racingcars);
        }
    }

    public List<String> getWinnerNameList() {
        return winnerList.stream()
                .map(Racingcar::getCarName)
                .toList();
    }
}

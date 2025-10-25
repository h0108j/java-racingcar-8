package racingcar.domain;

import racingcar.common.Validator.TrialCountValidator;
import racingcar.common.Validator.Validator;
import racingcar.view.ProgressObserver;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<ProgressObserver> progressObservers;
    private final int totalTrialCount;
    private int currentTrialCount;
    private Racingcars racingcars;
    private WinnerDecider winnerDecider;
    private List<Racingcar> winnerList;
    private Validator validator = new TrialCountValidator();

    public Race(int totalTrialCount, Racingcars racingcars) {
        validator.validate(totalTrialCount);
        this.totalTrialCount = totalTrialCount;
        this.racingcars = racingcars;
        this.progressObservers = new ArrayList<>();
        this.currentTrialCount = 0;
    }

    public void start() {
        moveRacingcars();
        winnerDecider = new WinnerDecider(racingcars);
        winnerList = winnerDecider.getWinner();
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

    public List<String> getWinnerNameList() {
        List<String> winnerNameList = new ArrayList<>();
        for (Racingcar racingcar : winnerList) {
            winnerNameList.add(racingcar.getCarName());
        }
        return winnerNameList;
    }
}

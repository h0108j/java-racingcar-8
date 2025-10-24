package racingcar.domain;

public class Race {
    private final int totalTrialCount;
    private int currentTrialCount;
    private Racingcars racingcars;

    public Race(int totalTrialCount, Racingcars racingcars) {
        this.totalTrialCount = totalTrialCount;
        this.racingcars = racingcars;
        this.currentTrialCount = 0;
    }

    public void start() {
        moveRacingcars();
    }

    private void moveRacingcars() {
        RandomMove randomMove = new RandomMove(racingcars);
        while (currentTrialCount < totalTrialCount) {
            randomMove.doTrial();
            showProgress();
            currentTrialCount++;
        }
    }

    private void showProgress() {

    }
}

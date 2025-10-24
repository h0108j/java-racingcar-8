package racingcar.domain;

public class Race {
    private final int totalTrialCount;
    private int currentTrialCount;
    private Racingcars racingcars;

    public Race(int totalTrialCount, Racingcars racingcars) {
        this.totalTrialCount = totalTrialCount;
        this.racingcars = racingcars;
    }
}

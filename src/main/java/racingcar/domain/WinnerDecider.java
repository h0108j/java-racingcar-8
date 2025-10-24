package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class WinnerDecider {
    private List<Racingcar> winnerList;
    private Racingcars racingcars;
    private int maxRecord;

    public WinnerDecider(Racingcars racingcars) {
        this.racingcars = racingcars;
        this.winnerList = new ArrayList<>();
        this.maxRecord = 0;
    }

    public List<Racingcar> getWinner() {
        for (Racingcar racingcar : racingcars.getRacingcarList()) {
            if (maxRecord <= racingcar.getMoveCount()) {
                maxRecord = racingcar.getMoveCount();
            }
        }
        for (Racingcar racingcar : racingcars.getRacingcarList()) {
            if (maxRecord == racingcar.getMoveCount()) {
                winnerList.add(racingcar);
            }
        }
        return winnerList;
    }
}

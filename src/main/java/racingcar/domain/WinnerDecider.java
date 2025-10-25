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
            int moveCount = racingcar.getMoveCount();

            if (moveCount > maxRecord) {
                maxRecord = moveCount;
                winnerList.clear();
                winnerList.add(racingcar);
            } else if (moveCount == maxRecord) {
                winnerList.add(racingcar);
            }
        }
        return winnerList;
    }
}

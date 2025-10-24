package racingcar.domain;

import static racingcar.common.Constants.STARTING_POINT;

public class Racingcar {
    private final String carName;
    private int moveCount;

    public Racingcar(String carName) {
        this.carName = carName;
        this.moveCount = STARTING_POINT;
    }

    public void moveForward() {
        moveCount++;
    }

    public String getCarName() {
        return carName;
    }
}

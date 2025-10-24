package racingcar.domain;

import static racingcar.common.Constants.MAXIMUM_RACINGCAR_NAME_LENGTH;
import static racingcar.common.Exceptions.INVALID_CAR_NAME_EXCEPTION;

public class RacingcarFactory {
    public static Racingcar createRacingcar(String racingcarName) {
        if (racingcarName.length() > MAXIMUM_RACINGCAR_NAME_LENGTH) {
            throw new IllegalArgumentException(INVALID_CAR_NAME_EXCEPTION);
        }
        return new Racingcar(racingcarName);
    }
}

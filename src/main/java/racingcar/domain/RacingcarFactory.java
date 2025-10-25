package racingcar.domain;

import racingcar.common.Validator.RacingcarNameValidator;
import racingcar.common.Validator.Validator;

public class RacingcarFactory {
    private static final Validator validator = new RacingcarNameValidator();

    public static Racingcar createRacingcar(String racingcarName) {
        validator.validate(racingcarName);
        return new Racingcar(racingcarName);
    }
}

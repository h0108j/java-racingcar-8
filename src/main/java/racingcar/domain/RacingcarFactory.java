package racingcar.domain;

import racingcar.common.validator.RacingcarNameValidator;
import racingcar.common.validator.Validator;

public class RacingcarFactory {
    private static final Validator validator = new RacingcarNameValidator();

    public static Racingcar createRacingcar(String racingcarName) {
        validator.validate(racingcarName);
        return new Racingcar(racingcarName);
    }
}

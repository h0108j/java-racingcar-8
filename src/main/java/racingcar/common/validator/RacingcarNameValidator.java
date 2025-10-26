package racingcar.common.validator;

import static racingcar.common.Constants.MAXIMUM_RACINGCAR_NAME_LENGTH;
import static racingcar.common.Exceptions.EMPTY_RACINGCAR_NAME_EXCEPTION;
import static racingcar.common.Exceptions.RACINGCAR_NAME_LENGTH_EXCEPTION;

public class RacingcarNameValidator implements Validator<String> {
    @Override
    public void validate(String racingcarName) {
        validateNameLength(racingcarName);
        validateEmptyName(racingcarName);
    }

    private void validateNameLength(String racingcarName) {
        if (racingcarName.length() > MAXIMUM_RACINGCAR_NAME_LENGTH) {
            throw new IllegalArgumentException(RACINGCAR_NAME_LENGTH_EXCEPTION);
        }
    }

    private void validateEmptyName(String racingcarName) {
        if (racingcarName.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_RACINGCAR_NAME_EXCEPTION);
        }
    }
}

package racingcar.common.Validator;

import racingcar.domain.Racingcar;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static racingcar.common.Constants.MAXIMUM_RACINGCAR_QUANTITY;
import static racingcar.common.Exceptions.DUPLICATE_RACINGCAR_NAME_EXCEPTION;
import static racingcar.common.Exceptions.RACINGCAR_QUANTITY_EXCEPTION;

public class RacingcarsValidator implements Validator<List<Racingcar>>{
    @Override
    public void validate(List<Racingcar> racingcarList) {
        validateRacingcarQuantity(racingcarList);
        validateDuplicateRacingcar(racingcarList);
    }

    private void validateRacingcarQuantity(List<Racingcar> racingcarList) {
        if (racingcarList.size() > MAXIMUM_RACINGCAR_QUANTITY) {
            throw new IllegalArgumentException(RACINGCAR_QUANTITY_EXCEPTION);
        }
    }

    private void validateDuplicateRacingcar(List<Racingcar> racingcarList) {
        Set<String> seen = new HashSet<>();
        for (Racingcar racingcar : racingcarList) {
            seen.add(racingcar.getCarName());
        }
        if (seen.size() != racingcarList.size()) {
            throw new IllegalArgumentException(DUPLICATE_RACINGCAR_NAME_EXCEPTION);
        }
    }
}

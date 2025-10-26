package racingcar.common.validator;

import static racingcar.common.Constants.MAXIMUM_TRIAL_COUNT;
import static racingcar.common.Exceptions.OVER_MAXIMUM_TRIAL_COUNT_EXCEPTION;
import static racingcar.common.Exceptions.TRIAL_COUNT_MUST_BE_POSITIVE_NUMBER;

public class TrialCountValidator implements Validator<Integer> {
    @Override
    public void validate(Integer trialCount) {
        //count 횟수 검증
    }

    private void validateTrialCount(int trialCount) {
        if (trialCount < 0) {
            throw new IllegalArgumentException(TRIAL_COUNT_MUST_BE_POSITIVE_NUMBER);
        } else if (trialCount > MAXIMUM_TRIAL_COUNT) {
            throw new IllegalArgumentException(OVER_MAXIMUM_TRIAL_COUNT_EXCEPTION);
        }
    }
}

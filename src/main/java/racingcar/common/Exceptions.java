package racingcar.common;

import static racingcar.common.Constants.*;

public class Exceptions {
    private Exceptions() {}

    public static final String RACINGCAR_NAME_LENGTH_EXCEPTION
            = "잘못된 자동차 이름입니다. 자동차 이름은 5자 이하여야 합니다.";
    public static final String EMPTY_RACINGCAR_NAME_EXCEPTION
            = "잘못된 자동차 이름입나다. 자동차 이름은 공백일 수 없습니다.";
    public static final String OVER_RACINGCAR_MAXIMUM_EXCEPTION
            = "잘못된 자동차 개수입니다. 자동차 개수는 " + MAXIMUM_RACINGCAR_QUANTITY + "를 넘을 수 없습니다.";
    public static final String UNDER_RACINGCAR_MINIMUM_EXCEPTION
            = "잘못된 자동차 개수입니다. 자동차 개수는 " + MINIMUM_RACINGCAR_QUANTITY + " 이상이어야 합니다.";
    public static final String DUPLICATE_RACINGCAR_NAME_EXCEPTION
            = "잘못된 자동차 입력입니다. 자동차 이름은 중복일 수 없습니다.";
    public static final String TRIAL_COUNT_MUST_BE_POSITIVE_NUMBER
            = "잘못된 시도 횟수입니다. 시도 횟수는 양수여야 합니다.";
    public static final String OVER_MAXIMUM_TRIAL_COUNT_EXCEPTION
            = "잘못된 시도 횟수입니다. 시도 횟수는 " + MAXIMUM_TRIAL_COUNT + "를 넘을 수 없습니다.";
}

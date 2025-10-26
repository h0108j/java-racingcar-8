package racingcar.domain;

import racingcar.common.validator.RacingcarsValidator;
import racingcar.common.validator.Validator;

import java.util.ArrayList;
import java.util.List;

import static racingcar.common.Constants.RACINGCAR_NAME_DELIMITER;

public class Racingcars {
    private Validator validator = new RacingcarsValidator();
    private List<String> racingcarNameList;
    private List<Racingcar> racingcarList;
    
    public Racingcars(String inputRacingcar) {
        createRacingcarList(inputRacingcar);
    }

    private void createRacingcarList(String inputRacingcar) {
        racingcarNameList = List.of(inputRacingcar.split(RACINGCAR_NAME_DELIMITER));
        racingcarList = racingcarNameList.stream()
                .map(RacingcarFactory::createRacingcar)
                .toList();
        validator.validate(racingcarList);
    }

    public List<Racingcar> getRacingcarList() {
        return racingcarList;
    }
}

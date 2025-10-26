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
        racingcarList = new ArrayList<>();
        racingcarNameList = List.of(inputRacingcar.split(RACINGCAR_NAME_DELIMITER));
        for (String racingcarName : racingcarNameList) {
            racingcarList.add(RacingcarFactory.createRacingcar(racingcarName));
        }
        validator.validate(racingcarList);
    }

    public List<Racingcar> getRacingcarList() {
        return racingcarList;
    }
}

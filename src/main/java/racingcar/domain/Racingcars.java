package racingcar.domain;

import racingcar.common.Validator.RacingcarsValidator;
import racingcar.common.Validator.Validator;

import java.util.ArrayList;
import java.util.List;

import static racingcar.common.Constants.RACINGCAR_NAME_DELIMITER;

public class Racingcars {
    private Validator validator = new RacingcarsValidator();
    private List<String> racingcarNameList;
    private List<Racingcar> racingcarList;
    private int racingcarCount;
    
    public Racingcars(String inputRacingcar) {
        racingcarList = new ArrayList<>();
        racingcarNameList = List.of(inputRacingcar.split(RACINGCAR_NAME_DELIMITER));
        racingcarCount = 0;
        for (String racingcarName : racingcarNameList) {
            racingcarList.add(RacingcarFactory.createRacingcar(racingcarName));
            racingcarCount++;
        }
        validator.validate(racingcarList);
    }

    public List<String> getRacingcarNameList() {
        return racingcarNameList;
    }

    public List<Racingcar> getRacingcarList() {
        return racingcarList;
    }

    public int getRacingcarCount() {
        return racingcarCount;
    }
}

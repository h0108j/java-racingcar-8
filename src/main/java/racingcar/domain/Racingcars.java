package racingcar.domain;

import java.util.List;

public class Racingcars {
    private List<String> racingcarNameList;
    private List<Racingcar> racingcarList;
    
    public Racingcars(String inputRacingcar) {
        racingcarNameList = List.of(inputRacingcar);
        for (String racingcarName : racingcarNameList) {
            racingcarList.add(RacingcarFactory.createRacingcar(racingcarName));
        }
    }
}

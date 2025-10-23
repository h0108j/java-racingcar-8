package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static racingcar.common.Constants.READ_RACINGCAR_MESSAGE;
import static racingcar.common.Constants.READ_TRIAL_COUNT_MESSAGE;

public class ConsoleInputView implements InputView {
    @Override
    public String readRacingcar() {
        System.out.println(READ_RACINGCAR_MESSAGE);
        return readLine();
    }

    @Override
    public int readTrialCount() {
        System.out.println(READ_TRIAL_COUNT_MESSAGE);
        return Integer.parseInt(readLine());
    }
}

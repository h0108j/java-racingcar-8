package racingcar.controller;

import racingcar.domain.Race;
import racingcar.domain.Racingcars;
import racingcar.view.*;

import java.util.List;

public class RacingcarController {
    private final InputView inputView;
    private final OutputView outputView;
    private final ProgressOutputView progressOutputView;

    public RacingcarController() {
        this.inputView = new ConsoleInputView();
        this.outputView = new ConsoleOutputView();
        this.progressOutputView = new ProgressOutputView();
    }

    public void run() {
        Racingcars racingcars = inputRacingcars();
        Race race = createRace(racingcars);
        race.addProgressObserver(progressOutputView);
        race.start();
        showResult(race.getWinnerNameList());
    }

    private Race createRace(Racingcars racingcars) {
        return new Race(inputTrialCount(), racingcars);
    }

    private Racingcars inputRacingcars() {
        return new Racingcars(inputView.readRacingcars());
    }

    private int inputTrialCount() {
        return inputView.readTrialCount();
    }

    public void showResult(List<String> winnerList) {
        outputView.printResult(winnerList);
    }
}

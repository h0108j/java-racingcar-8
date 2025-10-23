package racingcar.controller;

import racingcar.domain.Race;
import racingcar.domain.Racingcars;
import racingcar.view.ConsoleInputView;
import racingcar.view.ConsoleOutputView;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingcarController {
    private final InputView inputView;
    private final OutputView outputView;

    public RacingcarController() {
        this.inputView = new ConsoleInputView();
        this.outputView = new ConsoleOutputView();
    }

    public void run() {
        Racingcars racingcars = inputRacingcars();
        Race race = createRace(racingcars);
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

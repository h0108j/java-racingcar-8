package racingcar.view;

import java.util.List;

import static racingcar.common.Constants.OUTPUT_PRINT_MESSAGE;

public class ConsoleOutputView implements OutputView {
    @Override
    public void printResult(List<String> winnerList) {
        String result = String.join(", ", winnerList);
        System.out.println(OUTPUT_PRINT_MESSAGE + result);
    }
}

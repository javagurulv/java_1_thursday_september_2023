package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudRules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5()
    );

    FraudDetectionResult isFraud(Transaction transaction) {
        return fraudRules.stream()
                .filter(fraudRule -> fraudRule.isFraud(transaction))
                .findFirst()
                .map(this::buildFraudResult)
                .orElse(buildNotFraudResult());
    }

    private FraudDetectionResult buildNotFraudResult() {
        return new FraudDetectionResult(false, null);
    }

    private FraudDetectionResult buildFraudResult(FraudRule fraudRule) {
        return new FraudDetectionResult(true, fraudRule.getRuleName());
    }

}

package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson10;

public class FraudDetectionResult {
    private boolean fraud;

    private String rullName;

    public FraudDetectionResult(boolean fraud, String rullName) {
        this.fraud = fraud;
        this.rullName = rullName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRullName() {
        return rullName;
    }
}

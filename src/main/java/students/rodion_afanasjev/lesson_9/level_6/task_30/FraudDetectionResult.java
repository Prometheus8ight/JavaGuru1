package students.rodion_afanasjev.lesson_9.level_6.task_30;

public class FraudDetectionResult{

    private boolean fraud;
    private String ruleName;


    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

}

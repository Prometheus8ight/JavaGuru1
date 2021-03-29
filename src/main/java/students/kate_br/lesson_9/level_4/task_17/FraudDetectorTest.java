package students.kate_br.lesson_9.level_4.task_17;

public class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.fraudNameTest();
        test.fraudNameTestFail();
    }

    public void fraudNameTest() {
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Moscow");
        Transaction transaction = new Transaction(trader, 50);
        checkTestResult(true, detector.isFraud(transaction), "Fraud name test: ");
    }

    public void fraudNameTestFail(){
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Mike", "Moscow");
        Transaction transaction = new Transaction(trader, 50);
        checkTestResult(true, detector.isFraud(transaction), "Fraud fail name test: ");
    }

    private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

        if (expectedResult == realResult){
            System.out.println(testName + "OK");
        }else {
            System.out.println(testName + "FAIL");
        }
    }
}



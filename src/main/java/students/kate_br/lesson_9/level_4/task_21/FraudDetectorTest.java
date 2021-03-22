package students.kate_br.lesson_9.level_4.task_21;

public class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.fraudTest1();
        test.fraudTest2();
        test.fraudTest3();
        test.fraudTest4();

    }

    public void fraudTest1(){
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Mike", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        checkTestResult(true, detector.isFraud(transaction), "Fraud first test: " );
    }

    public void fraudTest2(){
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("John", "Moscow");
        Transaction transaction = new Transaction(trader, 900);
        checkTestResult(false, detector.isFraud(transaction), "Fraud second test: " );
    }

    public void fraudTest3(){
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Germany");
        Transaction transaction = new Transaction(trader, 3000);
        checkTestResult(true, detector.isFraud(transaction), "Fraud third test: " );
    }

    public void fraudTest4(){
        FraudDetector detector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Germany");
        Transaction transaction = new Transaction(trader, 3000);
        checkTestResult(false, detector.isFraud(transaction), "Fraud fail test: " );
    }

    private void checkTestResult(boolean expectedResult, boolean realResult, String testName){

        if (realResult == expectedResult){
            System.out.println(testName + "OK");
        }else {
            System.out.println(testName + "FAIL");
        }
    }
}

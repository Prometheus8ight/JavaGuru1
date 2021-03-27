package students.bogdans_pavlovs.lesson_9;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.pokemonTest();
        fraudDetectorTest.lessThanTest();
        fraudDetectorTest.notFromSydneyTest();
        fraudDetectorTest.notFromJamaicaTest();
        fraudDetectorTest.germanyRegulationsTest();
    }

    void pokemonTest(){

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 600);
        FraudDetector fraudDetector = new FraudDetector(transaction);
        checkResult(fraudDetector.isFraud(transaction), true, "Pokemon Test");

    }

    void lessThanTest(){

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Riga"), 1000001);
        FraudDetector fraudDetector = new FraudDetector(transaction);
        checkResult(fraudDetector.isFraud(transaction), true, "1000000 or Less Test");

    }

    void notFromSydneyTest(){

        Transaction transaction = new Transaction(new Trader("Definitely Not Pokemon", "Sydney"), 999999);
        FraudDetector fraudDetector = new FraudDetector(transaction);
        checkResult(fraudDetector.isFraud(transaction), true, "Not From Sydney Test");

    }

    void germanyRegulationsTest(){

        Transaction transaction = new Transaction(new Trader("Hans", "Germany"), 1001);
        FraudDetector fraudDetector = new FraudDetector(transaction);
        checkResult(fraudDetector.isFraud(transaction), true, "Germany Regulations Test");

    }

    void notFromJamaicaTest(){

        Transaction transaction = new Transaction(new Trader("Definitely Not Pokemon", "Jamaica"), 999999);
        FraudDetector fraudDetector = new FraudDetector(transaction);
        checkResult(fraudDetector.isFraud(transaction), true, "Not From Jamaica Test");


    }

    void checkResult(boolean realResult, boolean expectedResult, String testName){

        if(realResult == expectedResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }


}

package students.bogdans_pavlovs.lesson_9.level_6;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.fraudRuleTest1();
        fraudDetectorTest.fraudRuleTest2();
        fraudDetectorTest.fraudRuleTest3();
        fraudDetectorTest.fraudRuleTest4();
        fraudDetectorTest.fraudRuleTest5();
    }


    void fraudRuleTest1(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("Country is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga"), 10);
        FraudDetectionResult fraudResult = fraudDetector.isFraud(transaction);
        checkResult(fraudResult.getRuleName(), "Name is not Pokemon", "Pokemon Test");

    }

    void fraudRuleTest2(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("Country is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Riga"), 1000001);
        FraudDetectionResult fraudResult = fraudDetector.isFraud(transaction);

        checkResult(fraudResult.getRuleName(), "Amount is <= than 1,000,000", "1000000 or Less Test");

    }

    void fraudRuleTest3(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("Country is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Sydney"), 999999);
        FraudDetectionResult fraudResult = fraudDetector.isFraud(transaction);
        checkResult(fraudResult.getRuleName(), "Country is not Sydney", "Not From Sydney Test");

    }

    void fraudRuleTest4(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("Country is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Jamaica"), 100);
        FraudDetectionResult fraudResult = fraudDetector.isFraud(transaction);
        checkResult(fraudResult.getRuleName(), "Country is not Jamaica", "Not From Jamaica Test");

    }

    void fraudRuleTest5(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("Country is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Germany"), 1001);
        FraudDetectionResult fraudResult = fraudDetector.isFraud(transaction);
        checkResult(fraudResult.getRuleName(), "Country is Germany and Amount is <= 1,000", "Germany Regulations Test");
    }

    void checkResult(String realResult, String expectedResult, String testName){

        if(realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }


}


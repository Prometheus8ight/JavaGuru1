package students.bogdans_pavlovs.lesson_9.level_5;

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
                new FraudRule3("City is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Pokemon", "Riga", "Latvia"), 10);
        checkResult(fraudDetector.isFraud(transaction), true, "Pokemon Test");

    }

    void fraudRuleTest2(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("City is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Riga", "Latvia"), 1000001);
        checkResult(fraudDetector.isFraud(transaction), true, "1000000 or Less Test");

    }

    void fraudRuleTest3(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("City is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Sydney", "Australia"), 999999);
        checkResult(fraudDetector.isFraud(transaction), true, "Not From Sydney Test");

    }

    void fraudRuleTest4(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("City is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon","Kingston", "Jamaica"), 100);
        checkResult(fraudDetector.isFraud(transaction), true, "Not From Jamaica Test");

    }

    void fraudRuleTest5(){

        FraudDetector fraudDetector = new FraudDetector(new FraudRule[]{
                new FraudRule1("Name is not Pokemon"),
                new FraudRule2("Amount is <= than 1,000,000"),
                new FraudRule3("City is not Sydney"),
                new FraudRule4("Country is not Jamaica"),
                new FraudRule5("Country is Germany and Amount is <= 1,000")});

        Transaction transaction = new Transaction(new Trader("Not Pokemon", "Berlin", "Germany"), 1001);
        checkResult(fraudDetector.isFraud(transaction), true, "Germany Regulations Test");
    }

    void checkResult(boolean realResult, boolean expectedResult, String testName){

        if(realResult == expectedResult){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }


}


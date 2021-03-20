package students.rodion_afanasjev.lesson_9.level_4.task_17;

class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.traderNameTest();
        fraudDetectorTest.traderNameTest2();
        fraudDetectorTest.transactionAmountTest();
        fraudDetectorTest.transactionAmountTest2();
        fraudDetectorTest.cityTraderTest();
        fraudDetectorTest.cityTraderTest2();
        fraudDetectorTest.cityTraderTest3();
        fraudDetectorTest.cityAndAmountTest();
        fraudDetectorTest.cityAndAmountTest2();

    }

    public void traderNameTest(){
        Trader trader = new Trader("Pokemon","Магадан");
        Transaction t = new Transaction(trader,150);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,true,"traderNameTest");
    }

    public void traderNameTest2(){
        Trader trader = new Trader("Pokenom","Магадан");
        Transaction t = new Transaction(trader,150);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,false,"traderNameTest2");
    }

    public void transactionAmountTest(){
        Trader trader = new Trader("David","Магадан");
        Transaction t = new Transaction(trader,1500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,true,"transactionAmountTest");
    }

    public void transactionAmountTest2(){
        Trader trader = new Trader("David","Магадан");
        Transaction t = new Transaction(trader,500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,false,"transactionAmountTest2");
    }

    public void cityTraderTest(){
        Trader trader = new Trader("David","Сидней");
        Transaction t = new Transaction(trader,500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,true,"cityTraderTest");
    }

    public void cityTraderTest2(){
        Trader trader = new Trader("David","Магадан");
        Transaction t = new Transaction(trader,500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,false,"cityTraderTest2");
    }

    public void cityTraderTest3(){
        Trader trader = new Trader("David","Ямайка");
        Transaction t = new Transaction(trader,500000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,true,"cityTraderTest3");
    }

    public void cityAndAmountTest(){
        Trader trader = new Trader("David","Германия");
        Transaction t = new Transaction(trader,2000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,true,"cityAndAmountTest");
    }

    public void cityAndAmountTest2(){
        Trader trader = new Trader("David","Германия");
        Transaction t = new Transaction(trader,500);
        FraudDetector fraudDetector = new FraudDetector();
        boolean realResult = fraudDetector.isFraud(t);
        equalCheck(realResult,false,"cityAndAmountTest2");
    }

    public void equalCheck(boolean realResult,boolean expectedResult,String testName){
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}

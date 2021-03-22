package students.alex_kalashnikov.lesson_9.level_6.task_33;

class FraudDetectorDemo {

    public static void main(String[] args) {

        FraudDetector fraudDetector = new FraudDetector();
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 15000000);
        fraudDetector.isFraud2(transaction);

    }

}
package students.andrew_galashin.lesson_9.level_5.task_23;

class FraudDetectorCountry {
    boolean fraud(Transaction transaction){
        return transaction.getTrader().getCountry() == "Ямайка";
    }
}
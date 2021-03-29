package students.andrew_galashin.lesson_9.level_5.task_23;

class FraudDetectorCity {
    boolean fraud(Transaction transaction){
        return transaction.getTrader().getCity() == "Сидней";
    }
}

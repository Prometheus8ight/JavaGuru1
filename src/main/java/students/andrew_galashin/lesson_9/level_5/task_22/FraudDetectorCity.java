package students.andrew_galashin.lesson_9.level_5.task_22;

class FraudDetectorCity {
    boolean fraud(Transaction transaction){
        return transaction.getTrader().getCity() == "Сидней";
    }
}

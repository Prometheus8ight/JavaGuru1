package students.andrew_galashin.lesson_9.level_5.task_23;

class FraudDetectorAmount {
    boolean fraud(Transaction transaction){
        return transaction.getAmount() > 1000000;
    }
}

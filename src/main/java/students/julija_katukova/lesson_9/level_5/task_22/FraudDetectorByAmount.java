package students.julija_katukova.lesson_9.level_5.task_22;

class FraudDetectorByAmount {
    boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}

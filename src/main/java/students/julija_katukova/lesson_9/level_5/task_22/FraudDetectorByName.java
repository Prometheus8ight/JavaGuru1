package main.java.students.julija_katukova.lesson_9.level_5.task_22;

class FraudDetectorByName {
    boolean isFraud(Transaction t) {
        return t.getTrader().getFullName() == "Pokemon";
    }
}

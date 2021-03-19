package main.java.students.julija_katukova.lesson_9.level_5.task_22;

class FraudDetectorByCity {
    boolean isFraud(Transaction t) {
        return t.getTrader().getCity() == "Сидней" || t.getTrader().getCity() == "Sydney";
    }
}

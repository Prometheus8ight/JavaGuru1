package main.java.students.julija_katukova.lesson_9.level_5.task_22;

class FraudDetectorByCountry {
    boolean isFraud(Transaction t) {
        return t.getTrader().getCountry() == "Ямайка" || t.getTrader().getCountry() == "Jamaica";
    }
}

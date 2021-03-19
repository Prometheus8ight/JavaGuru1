package main.java.students.julija_katukova.lesson_9.level_5.task_22;

class FraudDetectorByCountryAndAmount {
    boolean isFraud(Transaction t) {
        return t.getTrader().getCountry() == "Германия" && t.getAmount() > 1000 ||
                t.getTrader().getCountry() == "Germany" && t.getAmount() > 1000;
    }
}

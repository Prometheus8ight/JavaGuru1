package students.rodion_afanasjev.lesson_9.level_4.task_17;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        if (t.getAmount() > 1000000) {
            return true;
        }
        if (t.getTrader().getCity().equals("Сидней")) {
            return true;
        }
        if (t.getTrader().getCity().equals("Ямайка")) {
            return true;
        }
        if (t.getTrader().getCity().equals("Германия") && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }

}

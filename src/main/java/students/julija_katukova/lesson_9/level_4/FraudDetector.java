package students.julija_katukova.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName() == "Pokemon") {
            return true;
        }
        if (t.getAmount() > 1000000) {
            return true;
        }
        if (t.getTrader().getCity() == "Сидней" || t.getTrader().getCity() == "Sydney") {
            return true;
        }
        if (t.getTrader().getCountry() == "Ямайка" || t.getTrader().getCountry() == "Jamaica") {
            return true;
        }
        if (t.getTrader().getCountry() == "Германия" && t.getAmount() > 1000 ||
                t.getTrader().getCountry() == "Germany" && t.getAmount() > 1000) {
            return true;
        }
        return false;
    }

}

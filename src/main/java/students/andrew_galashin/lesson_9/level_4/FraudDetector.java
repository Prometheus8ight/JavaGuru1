package students.andrew_galashin.lesson_9.level_4;

class FraudDetector {

    boolean fraud(Transaction transaction) {
        if (transaction.getTrader().getFullName() == "Pokemon") {
            return true;
        } else if (transaction.getAmount() > 1000000) {
            return true;
        } else if (transaction.getTrader().getCity() == "Сидней" ) {
            return true;
        } else if (transaction.getTrader().getCountry() == "Ямайка") {
            return true;
        } else if(transaction.getTrader().getCountry() == "Германия" && transaction.getAmount() > 1000){
            return true;
        }
        return false;
    }


}

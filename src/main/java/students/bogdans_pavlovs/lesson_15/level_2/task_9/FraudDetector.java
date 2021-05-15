package students.bogdans_pavlovs.lesson_15.level_2.task_9;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return checkIfCityFraudulent(trader) || checkIfNameFraudulent(trader);
    }

    private boolean checkIfNameFraudulent(Trader trader) {
        return trader.getName().equals("Pokemon");
    }

    private boolean checkIfCityFraudulent(Trader trader) {
        return trader.getCity().equals("Sidney");
    }

}

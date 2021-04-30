package students.julija_katukova.lesson_15.level_2.task_9;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return isNameFraudulent(trader)
                ||
                (isCityFraudulent(trader));
    }

    private boolean isNameFraudulent(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean isCityFraudulent(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}
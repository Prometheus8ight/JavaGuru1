package students.andrew_galashin.lesson_15.level_2.task_9;


public class FraudDetector {
    boolean isFraud(Trader trader, String tradersName, String tradersCity) {
        return compareTraderName(trader, tradersName)
                ||
                (compareTraderCity(trader, tradersCity));
    }

    private boolean compareTraderName(Trader trader, String tradersName) {
        return trader.getFullName().equals(tradersName);
    }

    private boolean compareTraderCity(Trader trader, String tradersCity) {
        return trader.getCity().equals(tradersCity);
    }
}

package students.deniss_jankovskis.lesson_15.level_2.task_9;

public class FraudDetector {

    public boolean isFraud(Trader trader) {
        return (isFraudTraderName(trader) || (isFraudTraderCity(trader)));
    }

    private boolean isFraudTraderName(Trader trader) {
        String traderName = trader.getName();
        return traderName.equals("Pokemon");
    }

    private boolean isFraudTraderCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}

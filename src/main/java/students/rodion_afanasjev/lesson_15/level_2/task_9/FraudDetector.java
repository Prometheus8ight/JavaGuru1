package students.rodion_afanasjev.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraud(Trader trader, String traderName, String traderCity) {
        return compareTraderName(trader,traderName) || compareCity(trader,traderCity);
    }

    private boolean compareTraderName(Trader trader, String traderName) {
        return traderName.equals(trader.getName());
    }

    private boolean compareCity(Trader trader, String traderCity) {
        return traderCity.equals(trader.getCity());
    }

}

class Trader {

    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

}

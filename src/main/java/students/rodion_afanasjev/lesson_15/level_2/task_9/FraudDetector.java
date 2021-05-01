package students.rodion_afanasjev.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isTraderNameBanned(trader) || isTraderCityBanned(trader);
    }

    private boolean isTraderNameBanned(Trader trader) {
        return trader.getName().equals("Pokemon");
    }

    private boolean isTraderCityBanned(Trader trader) {
        return trader.getCity().equals("Sidney");
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

package students.deniss_jankovskis.lesson_9.level_4;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}


class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}


class FraudDetector {

    boolean isFraud(Transaction t) {

        if (t.getTrader().getFullName().contains("Pokemon")) {
            return true;
        }
        if (t.getAmount() > 100000) {
            return true;
        }
        if (t.getTrader().getCity().contains("Sidney")) {
            return true;
        }
        if (t.getTrader().getCity().contains("Jamaica")) {
            return true;
        }
        if (t.getTrader().getCity().contains("Germany") && t.getAmount() > 1000) {
            return true;
        }
        return false;

    }


}

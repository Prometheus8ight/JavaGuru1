package students.alex_kalashnikov.lesson_9.level_6.task_33;

class Transaction {

    private Trader trader;
    private int amount;

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "Trader='" + trader + '\'' +
                ", Amount='" + amount + '\'' +
                '}';
    }

}
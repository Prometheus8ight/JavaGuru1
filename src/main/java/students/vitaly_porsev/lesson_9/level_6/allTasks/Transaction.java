package students.vitaly_porsev.lesson_9.level_6.allTasks;

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

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader = " + trader +
                ", amount = " + amount +
                '}';
    }
}

package students.alex_kalashnikov.lesson_8.level_3.task_13;

abstract public class CommonStock {

    protected String codeISIN;
    protected double currentPrice;

    public CommonStock(String codeISIN, double currentPrice) {
        this.codeISIN = codeISIN;
        this.currentPrice = currentPrice;
    }

    abstract double calculateDividendYield();

}

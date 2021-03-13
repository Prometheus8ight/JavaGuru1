package students.alex_kalashnikov.lesson_8.level_3.task_13;

class DividendStock extends CommonStock {

    private double dividendPerShare;

    public DividendStock(String codeISIN, double currentPrice, double dividendPerShare) {
        super(codeISIN, currentPrice);
        this.dividendPerShare = dividendPerShare;
    }

    @Override
    double calculateDividendYield() {
        return 100 * (dividendPerShare / currentPrice);
    }
}
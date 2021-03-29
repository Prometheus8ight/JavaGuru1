package students.alex_kalashnikov.lesson_8.level_2.task_7;

class DividendStock extends CommonStock {

    protected double dividendPerShare;

    public DividendStock(String codeISIN, String primaryExchange, double dividendPerShare) {
        super(codeISIN, primaryExchange);
        this.dividendPerShare = dividendPerShare;
    }
}
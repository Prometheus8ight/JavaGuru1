package students.alex_kalashnikov.lesson_13.level_1.all_tasks;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            return new BigDecimal("20000").multiply(new BigDecimal("0.25"))
                    .add(income.subtract(new BigDecimal("20000")).multiply(new BigDecimal("0.40")));
        }
    }

}
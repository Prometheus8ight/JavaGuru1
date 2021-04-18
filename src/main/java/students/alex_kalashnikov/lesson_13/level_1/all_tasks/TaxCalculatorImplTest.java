package students.alex_kalashnikov.lesson_13.level_1.all_tasks;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        assertEquals(taxCalculator.calculateTax(income), new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        assertEquals(taxCalculator.calculateTax(income), new BigDecimal("2500.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        assertEquals(taxCalculator.calculateTax(income), new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeAbove20000() {
        var income = new BigDecimal(30000);
        assertEquals(taxCalculator.calculateTax(income), new BigDecimal("9000.00"));
    }

}
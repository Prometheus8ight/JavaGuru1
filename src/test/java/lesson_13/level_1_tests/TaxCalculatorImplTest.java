package lesson_13.level_1_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import students.vitaly_porsev.lesson_13.level_1.allTasks.TaxCalculatorImpl;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorImplTest {

    @ParameterizedTest
    @CsvSource(value = {
            "0, 0.00",
            "12000, 1800.00",
            "30000, 9000.00",
            "20000, 5000.00"
    })
    public void happy_path_2_args(BigDecimal income, BigDecimal res) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl();
        assertEquals(res, taxCalculator.calculateTax(income));
    }
}

package instructor.lesson_13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    @Test
    public void happy_path_2_args() {
        Calculator subject = new Calculator();
        assertEquals(4, subject.sum(2, 2));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1, 1, 3",
            "1, 2, 3, 6",
            "2, 2, 2, 6",
            "3, 2, 1, 6",
    })
    public void happy_path_3_args(int a, int b, int c, int res) {
        Calculator subject = new Calculator();
        assertEquals(res, subject.sum(a, b, c));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12, 14, 16})
    public void is_even_true(int a) {
        Calculator subject = new Calculator();
        assertTrue(subject.isEven(a));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 13, 15})
    public void is_even_false(int a) {
        Calculator subject = new Calculator();
        assertFalse(subject.isEven(a));
    }
}

package students.deniss_jankovskis.lesson_13.level_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @BeforeEach
    void setUp() {
        StringCalculator stringCalculator = new StringCalculator();
    }

    @Test
    void calculator1() {
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void calculator2() {
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(5, stringCalculator.add("5"));
    }

    @Test
    void calculator3() {
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(6, stringCalculator.add("1, 1, 2, 2"));
    }

    @Test
    void calculator4(){
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(10, stringCalculator.add("1\\n23,4"));
    }

    @Test
    void calculator5(){
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(0, stringCalculator.add("1\n"));
    }

    @Test
    void calculator6(){
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(3, stringCalculator.add("//[;]\\n1;2"));
    }

    @Test
    void calculator7(){
        StringCalculator stringCalculator = new StringCalculator();
        Assertions.assertEquals(6, stringCalculator.add("//[;][&]\\n1;2&3"));
    }
}

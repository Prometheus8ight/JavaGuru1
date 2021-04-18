package students.julija_katukova.lesson_13.level_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();
    @Test
    void add1() {
        Assertions.assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void add2() {
        Assertions.assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    void add3() {
        Assertions.assertEquals(7, stringCalculator.add("1,6"));
    }

    @Test
    void add4() {
        Assertions.assertEquals(20, stringCalculator.add("6,1,8,2,3"));
    }

    @Test
    void add5() {
        Assertions.assertEquals(10, stringCalculator.add("1\n23,4"));
    }

    @Test
    void add6() {
        Assertions.assertEquals(3, stringCalculator.add("//[;]\\n1;2"));
    }

    @Test
    void add7() {
        Assertions.assertEquals(6, stringCalculator.add("//[;][&]\\n1;2&3"));
    }

}
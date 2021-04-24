package students.rodion_afanasjev.lesson_13.level_5.task_26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    public void sumEmptyStringTo0() {
        Assertions.assertEquals(StringCalculator.add(""), 0);
    }

    @Test
    public void sumToItself() {
        Assertions.assertEquals(StringCalculator.add("5"), 5);
    }

    @Test
    public void sumTwoNumbersSeparatedByComma() {
        Assertions.assertEquals(StringCalculator.add("1,2"), 3);
        Assertions.assertEquals(StringCalculator.add("1,3"), 4);
    }

    @Test
    public void sumThreeNumbersSeparatedByComma() {
        Assertions.assertEquals(StringCalculator.add("1,2,3"), 6);
    }

    @Test
    public void aLotOfNumbersSeparatedByComma() {
        Assertions.assertEquals(StringCalculator.add("1,2,3,4,5,6,7,8,9"), 45);
    }

    @Test
    public void sumTwoNumbersSeparatedByNewLine() {
        Assertions.assertEquals(StringCalculator.add("1\n23,4"), 10);
    }

    @Test
    public void sumTwoNumbersSeparatedByDifferentDelimiters() {
        Assertions.assertEquals(StringCalculator.add("//[;]\\n1;2"), 3);
    }

    @Test
    public void sumTwoNumbersSeparatedByFewDelimiters() {
        Assertions.assertEquals(StringCalculator.add("//[;][&]\\n1;2&3"), 6);
    }

}
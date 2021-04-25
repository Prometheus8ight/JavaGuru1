package students.alex_kalashnikov.lesson_13.level_5.all_tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest extends StringCalculator {

    @Test
    public void testSum1() {
        StringCalculator victim = new StringCalculator();
        assertEquals(0, victim.add(""));
    }

    @Test
    public void testSum2() {
        StringCalculator victim = new StringCalculator();
        assertEquals(1, victim.add("1"));
    }

    @Test
    public void testSum3() {
        StringCalculator victim = new StringCalculator();
        assertEquals(4, victim.add("1,3"));
    }

    @Test
    public void testSum4() {
        StringCalculator victim = new StringCalculator();
        assertEquals(1173, victim.add("1,3,100,15,1054"));
    }

    @Test
    public void testSum5() {
        StringCalculator victim = new StringCalculator();
        assertEquals(1173, victim.add("1\n3,100\n15,1054"));
    }

    @Test
    public void testSum6() {
        StringCalculator victim = new StringCalculator();
        assertThrows(WrongSymbols.class,
                () -> victim.add("1\n"));
    }

    @Test
    public void testSum7() {
        StringCalculator victim = new StringCalculator();
        assertEquals(1172, victim.add("1\n3;-5&100\n15;1054&4"));
    }

}
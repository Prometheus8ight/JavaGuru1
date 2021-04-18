package students.vitaly_porsev.lesson_13.level_5_allTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_13.level_5.allTasks.StringCalculator;

public class StringCalculatorTest {

    @Test
    public void testAddVNull(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(0, calculator.add(null));
    }

    @Test
    public void testAddV0(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(0, calculator.add(""));
    }

    @Test
    public void testAddV1(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(3, calculator.add("1, 2"));
    }

    @Test
    public void testAddV2(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(3, calculator.add("1, 2, hello"));
    }

    @Test
    public void testAddV3(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(6, calculator.add("bye, 1, 2, 3"));
    }

    @Test
    public void testAddV4(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(10, calculator.add("1\n23,4"));
    }

    @Test
    public void testAddV5(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(0, calculator.add("1\n"));
    }

    @Test
    public void testAddV6(){
        StringCalculator calculator = new StringCalculator();
        Assertions.assertEquals(3, calculator.add("//[;]\n1;2"));
    }
}

package students.rodion_afanasjev.lesson_15.level_2.task_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticEqTest {

    @Test
    public void discriminantLessThanZero(){
        QuadraticEq quadraticEq = new QuadraticEq();
        String expectedResult = "Equation has no roots";

        Assertions.assertEquals(expectedResult, quadraticEq.calc(2,2,2));
    }

    @Test
    public void discriminantGreaterThanZero(){
        QuadraticEq quadraticEq = new QuadraticEq();
        String expectedResult = "x1 = -2.0, x2 = -0.5";

        Assertions.assertEquals(expectedResult, quadraticEq.calc(2,5,2));
    }

    @Test
    public void discriminantEqualsZero(){
        QuadraticEq quadraticEq = new QuadraticEq();
        String expectedResult = "x = -1.0";

        Assertions.assertEquals(expectedResult, quadraticEq.calc(2,4,2));
    }

}
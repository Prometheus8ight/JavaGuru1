package students.bogdans_pavlovs.lesson_15.level_2.task_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticEqTest {

    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    void discriminantLessThanZero() {
        Assertions.assertEquals("Equation has no roots", quadraticEq.calc(10.0, 6.0, 9.0));
    }

    @Test
    void discriminantGreaterThanZero() {

        Assertions.assertEquals("x1 = -1.5, x2 = -1.0", quadraticEq.calc(2.0, 5.0, 3.0));
    }

    @Test
    void discriminantEqualsZero() {

        Assertions.assertEquals("x = -1.0", quadraticEq.calc(2.0, 4.0, 2.0));
    }

}

package students.deniss_jankovskis.lesson_15.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuadraticEqTest {

    @Test
    void discriminantGreaterThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        Assertions.assertEquals("x1 = -3.3333333333333335, x2 = 1.0", quadraticEq.calc(3, 7, -10));
    }

    @Test
    void discriminantEqualsZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        Assertions.assertEquals("x = 2.0", quadraticEq.calc(2, -8, 8));
    }

    @Test
    void discriminantLessThanZero() {
        QuadraticEq quadraticEq = new QuadraticEq();
        Assertions.assertEquals("Equation has no roots", quadraticEq.calc(2, 5, 9));
    }
}

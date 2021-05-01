package students.julija_katukova.lesson_15.level_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEqTest {

    QuadraticEq quadraticEq = new QuadraticEq();

    @Test
    void discriminantLessThanZero() {
        Assertions.assertEquals("Equation has no roots", quadraticEq.calc(2.0, 3.0, 5.0));
    }

    @Test
    void discriminantGreaterThanZero() {
        Assertions.assertEquals("x1 = -2.5, x2 = 1.0", quadraticEq.calc(2.0, 3.0, -5.0));
    }

    @Test
    void discriminantEqualsZero() {
        Assertions.assertEquals("x = -0.75", quadraticEq.calc(2.0, 3.0, 1.125));
    }


}
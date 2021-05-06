package students.alex_kalashnikov.lesson_15.level_2.task_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class QuadraticEquationTest {

    QuadraticEq victim = new QuadraticEq();

    @Test
    void hasTwoRoots1() {
        assertEquals("x1 = 80.0, x2 = 12.0", victim.calc(-2, 184, -1920));

    }

    @Test
    void hasTwoRoots2() {
        assertNotEquals("x = 80.0", victim.calc(-2, 184, -1920));

    }


    @Test
    void hasOneRoot() {
        assertEquals("x = " + (double) 1 / 3, victim.calc(-9, 6, -1));

    }

    @Test
    void hasNoRoots() {
        assertEquals("Equation has no roots", victim.calc(2, -1, 3.5));

    }

}
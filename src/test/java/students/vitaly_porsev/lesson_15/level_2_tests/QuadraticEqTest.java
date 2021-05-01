package students.vitaly_porsev.lesson_15.level_2_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_15.level_2.allTasks.QuadraticEq;

public class QuadraticEqTest {

    @Test
    void greaterThaNZero(){
        QuadraticEq method = new QuadraticEq();
        Assertions.assertEquals("x1 = 2.0, x2 = 6.0", method.calc(1,-8,12));
    }

    @Test
    void noRoots(){
        QuadraticEq method = new QuadraticEq();
        Assertions.assertEquals("Equation has no roots", method.calc(5,3,7));
    }

    @Test
    void DiscriminantIsZero(){
        QuadraticEq method = new QuadraticEq();
        Assertions.assertEquals("x = 3.0", method.calc(1,-6,9 ));
    }
}

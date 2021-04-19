package students.deniss_jankovskis.lesson_13.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator test = new GameOfLifeNextGenerationCalculator();
    Field field = new Field(3,3);

    @Test
    void calculator1() {
        field.boolTrue(0,0);
        test.calculate(field.getField());
        Field field1 = new Field(3,3);
        Assertions.assertArrayEquals(field.getField(), field1.getField());
    }

    @Test
    void calculator2() {
        field.boolTrue(1,2);
        test.calculate(field.getField());
        Field field1 = new Field(3,3);
        Assertions.assertArrayEquals(field.getField(), field1.getField());
    }

    @Test
    void calculator3() {
        field.boolTrue(1,2);
        field.boolTrue(1,2);
        field.boolTrue(1,2);
        test.calculate(field.getField());
        Field field1 = new Field(3,3);
        Assertions.assertArrayEquals(field.getField(), field1.getField());
    }

    @Test
    void calculator4() {
        field.boolTrue(0,1);
        field.boolTrue(2,1);
        field.boolTrue(1,0);
        field.boolTrue(2,2);
        test.calculate(field.getField());
        Field field1 = new Field(3,3);
        Assertions.assertArrayEquals(field.getField(), field1.getField());
    }
}

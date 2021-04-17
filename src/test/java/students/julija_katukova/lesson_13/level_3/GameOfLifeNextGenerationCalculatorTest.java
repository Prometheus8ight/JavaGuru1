package students.julija_katukova.lesson_13.level_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeNextGenerationCalculatorTest {
    GameOfLifeNextGenerationCalculator game = new GameOfLifeNextGenerationCalculator();
    Field field = new Field(3, 3);

    @Test
    void calculate1() {
        field.setAsTrue(1,1);
        game.calculate(field.getField());
        Field field2 = new Field(3, 3);
        Assertions.assertArrayEquals(field.getField(), field2.getField());
    }

    @Test
    void calculate2() {
        field.setAsTrue(0,1);
        field.setAsTrue(0,2);
        game.calculate(field.getField());
        Field field2 = new Field(3, 3);
        Assertions.assertArrayEquals(field.getField(), field2.getField());
    }

    @Test
    void calculate3() {
        field.setAsTrue(1,1);
        field.setAsTrue(0,1);
        field.setAsTrue(2,1);
        System.out.println(Arrays.deepToString(field.getField()));
        game.calculate(field.getField());
        System.out.println(Arrays.deepToString(field.getField()));
        Field field2 = new Field(3, 3);
        field2.setAsTrue(0,0);
        field2.setAsTrue(0, 1);
        field2.setAsTrue(0, 2);
        field2.setAsTrue(1, 2);
        Assertions.assertArrayEquals(field.getField(), field2.getField());
    }

    @Test
    void calculate4() {
        field.setAsTrue(1,1);
        field.setAsTrue(0,1);
        field.setAsTrue(2,1);
        field.setAsTrue(1,0);
        System.out.println(Arrays.deepToString(field.getField()));
        game.calculate(field.getField());
        System.out.println(Arrays.deepToString(field.getField()));
        Field field2 = new Field(3, 3);
        field2.setAsTrue(0,0);
        field2.setAsTrue(0, 1);
        field2.setAsTrue(0, 2);
        field2.setAsTrue(1, 2);
        Assertions.assertArrayEquals(field.getField(), field2.getField());
    }
}
package students.alex_kalashnikov.lesson_13.level_3.task_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeNextGenerationCalculatorTest {

    @Test
    public void shouldDieIfLessThenTwo1() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[1][1] = true;
        currentGeneration[2][1] = true;
        currentGeneration[1][2] = true;
        boolean[][] expected = new boolean[10][10];
        expected[1][1] = true;
        expected[2][1] = true;
        expected[1][2] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo2() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[2][5] = true;
        currentGeneration[2][6] = true;
        currentGeneration[3][6] = true;
        boolean[][] expected = new boolean[10][10];
        expected[2][5] = true;
        expected[2][6] = true;
        expected[3][6] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo3() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[7][7] = true;
        currentGeneration[7][8] = true;
        currentGeneration[8][8] = true;
        boolean[][] expected = new boolean[10][10];
        expected[7][7] = true;
        expected[7][8] = true;
        expected[8][8] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo4() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[1][0] = true;
        currentGeneration[1][1] = true;
        currentGeneration[2][0] = true;
        boolean[][] expected = new boolean[10][10];
        expected[1][0] = true;
        expected[1][1] = true;
        expected[2][0] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo5() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[1][0] = true;
        currentGeneration[1][9] = true;
        currentGeneration[2][0] = true;
        boolean[][] expected = new boolean[10][10];
        expected[1][0] = true;
        expected[1][9] = true;
        expected[2][0] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo6() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[8][1] = true;
        currentGeneration[9][0] = true;
        currentGeneration[9][1] = true;
        boolean[][] expected = new boolean[10][10];
        expected[8][1] = true;
        expected[9][0] = true;
        expected[9][1] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo7() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[4][8] = true;
        currentGeneration[4][9] = true;
        currentGeneration[5][9] = true;
        boolean[][] expected = new boolean[10][10];
        expected[4][8] = true;
        expected[4][9] = true;
        expected[5][9] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo8() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[0][0] = true;
        currentGeneration[0][9] = true;
        currentGeneration[9][9] = true;
        boolean[][] expected = new boolean[10][10];
        expected[0][0] = true;
        expected[0][9] = true;
        expected[9][9] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo9() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[1][1] = true;
        currentGeneration[1][2] = true;
        boolean[][] expected = new boolean[10][10];
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo10() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[1][1] = true;
        currentGeneration[2][1] = true;
        boolean[][] expected = new boolean[10][10];
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo11() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[3][4] = true;
        currentGeneration[4][4] = true;
        currentGeneration[5][4] = true;
        boolean[][] expected = new boolean[10][10];
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo12() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[8][0] = true;
        currentGeneration[9][0] = true;
        currentGeneration[9][1] = true;
        currentGeneration[9][9] = true;
        boolean[][] expected = new boolean[10][10];
        expected[8][0] = true;
        expected[9][0] = true;
        expected[9][1] = true;
        expected[9][9] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo13() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[4][3] = true;
        currentGeneration[4][4] = true;
        currentGeneration[4][6] = true;
        currentGeneration[5][6] = true;
        boolean[][] expected = new boolean[10][10];
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo14() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[0][0] = true;
        currentGeneration[8][8] = true;
        currentGeneration[9][9] = true;
        boolean[][] expected = new boolean[10][10];
        expected[9][9] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo15() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[3][3] = true;
        currentGeneration[4][4] = true;
        currentGeneration[5][5] = true;
        boolean[][] expected = new boolean[10][10];
        expected[4][4] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfLessThenTwo16() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[8][1] = true;
        currentGeneration[7][2] = true;
        currentGeneration[6][3] = true;
        boolean[][] expected = new boolean[10][10];
        expected[7][2] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfMoreThenThree1() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[3][3] = true;
        currentGeneration[3][4] = true;
        currentGeneration[4][3] = true;
        currentGeneration[4][4] = true;
        currentGeneration[5][3] = true;
        boolean[][] expected = new boolean[10][10];
        expected[3][3] = true;
        expected[3][4] = true;
        expected[4][4] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfMoreThenThree2() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[3][6] = true;
        currentGeneration[3][7] = true;
        currentGeneration[3][8] = true;
        currentGeneration[2][7] = true;
        currentGeneration[4][7] = true;
        boolean[][] expected = new boolean[10][10];
        expected[3][6] = true;
        expected[3][8] = true;
        expected[2][7] = true;
        expected[4][7] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfMoreThenThree3() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[0][0] = true;
        currentGeneration[8][0] = true;
        currentGeneration[8][9] = true;
        currentGeneration[9][8] = true;
        currentGeneration[9][9] = true;
        boolean[][] expected = new boolean[10][10];
        expected[8][9] = true;
        expected[9][8] = true;
        expected[8][0] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

    @Test
    public void shouldDieIfMoreThenThree4() {
        GameOfLifeNextGenerationCalculator victim = new GameOfLifeNextGenerationCalculator();
        boolean[][] currentGeneration = new boolean[10][10];
        currentGeneration[3][4] = true;
        currentGeneration[3][5] = true;
        currentGeneration[4][3] = true;
        currentGeneration[4][4] = true;
        currentGeneration[5][5] = true;
        boolean[][] expected = new boolean[10][10];
        expected[3][4] = true;
        expected[3][5] = true;
        expected[4][3] = true;
        assertArrayEquals(expected, victim.calculate(currentGeneration));
    }

}
package students.pavels_steinbors._lesson_6._level_4._task_21;

class TwoDimensionalArrayTest {

    int twoArraysSum(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total = total + array[i][j];
            }
        }
        return total;
    }

    void twoDimensionalArraySumTest() {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        int[][] array = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        checkResult(90, twoDimensionalArrayTest.twoArraysSum(array), "TwoDimensionalArraySumTest: ");
    }

    void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAILED");
        }

    }

}
package students.vitaly_porsev.lesson_6.level_4.task_21;

class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest method = new TwoDimensionalArrayTest();
        method.twoDSumTest();
    }

    void twoDSumTest() {
        TwoDimensionalArray method = new TwoDimensionalArray();
        int[][] array = {{1, 2, 3}, {5, 6, 7, 8, 9}, {12, 2}};
        checkResult(55, method.sumOf2DArray(array), "twoDSumTest");
    }

    void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}

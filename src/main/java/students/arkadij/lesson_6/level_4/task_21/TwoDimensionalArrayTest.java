package students.arkadij.lesson_6.level_4.task_21;

class TwoDimensionalArrayTest {

    void allTests(){
        twoDimTest();
    }

    private void checkTwoDimTest(int expectedResult, int realResult, String nameTest){
        if (expectedResult == realResult){
            System.out.println(nameTest + " - OK!");
        } else {
            System.out.println(nameTest + " - FAIL!");
        }
    }

    public void twoDimTest(){
        TwoDimensionalArray twoDimMethod = new TwoDimensionalArray();
        int[][] arr = {{5,1,5},{1,4,6}};
        checkTwoDimTest(22,
                twoDimMethod.twoSumArray(arr), "Two dimensional test");
    }

}

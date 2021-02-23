package students.rodion_afanasjev.lesson_5.level_5.task_31;

class ArraysTest {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();
        arrays.fillRandomly(arrays.create(15));

        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        int expectedResult = 10;
        Arrays arrays = new Arrays();
        int realResult = arrays.create(10).length;
        equalCheck(realResult, expectedResult,"shouldCreateArray");
    }

    public void shouldFindMaxNumber(){
        int expectedResult = 355;
        int[] array = {10, 15, 355, 95, 225};
        Arrays arrays = new Arrays();
        int realResult = arrays.findMax(array);
        equalCheck(realResult,expectedResult,"shouldFindMaxNumber");
    }

    public void shouldFindMinNumber(){
        int expectedResult = 10;
        int[] array = {10, 15, 355, 95, 225};
        Arrays arrays = new Arrays();
        int realResult = arrays.findMin(array);
        equalCheck(realResult,expectedResult,"shouldFindMinNumber");
    }

    public void equalCheck(int realResult,int expectedResult,String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " test : OK");
        } else {
            System.out.println(testName + " test : FAILED");
        }
    }
}

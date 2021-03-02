package students.arkadij.lesson_5.task_33;


class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray(){
        int expectedResult = 10;
        Arrays method = new Arrays();
        int[] num = method.create(10);
        int realResult = num.length;
        if (expectedResult == realResult){
            System.out.println("Should create array test - OK!");
        } else {
            System.out.println("Should create array test - FAIL!");
        }
    }

    public void shouldFindMaxNumber(){ // task 36
        int expectedResult = 10;
        int[] array = {1,3,5,7,10};
        Arrays arrays = new Arrays();
        int realResult = arrays.findMax(array);
        if (expectedResult == realResult){
            System.out.println("Should find max number test - OK!");
        } else {
            System.out.println("Should find max number test - FAIL!");
        }
    }

    public void shouldFindMinNumber(){ // task 38
        int expectedResult = 1;
        int[] array = {1,3,5,7,10};
        Arrays arrays = new Arrays();
        int realResult = arrays.findMin(array);
        if (expectedResult == realResult){
            System.out.println("Should find min number test - OK!");
        } else {
            System.out.println("Should find min number test - FAIL!");
        }
    }

}

package students.arkadij.lesson_5.task_32;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
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


}

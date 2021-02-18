package students.vitaly_porsev.lesson_5.level_6.task_38;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expectedResult = 5;
        Arrays methods = new Arrays();
        int[] array = methods.create(5);
        int realResult = array.length;
        if(expectedResult == realResult){
            System.out.println("shouldCreateArray - Test OK");
        }else{
            System.out.println("shouldCreateArray - Test FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int expectedResult = 99;
        int[] array = {11, 55, 78, 45, 99};
        Arrays methods = new Arrays();
        int realResult = methods.findMax(array);
        if(expectedResult == realResult){
            System.out.println("shouldFindMaxNumber - Test OK");
        }else {
            System.out.println("shouldFindMaxNumber - Test FAIL");
        }
    }

    public void shouldFindMinNumber() {
        int expectedResult = 1;
        int[] array = {111, 56, 1, 32, 88};
        Arrays methods = new Arrays();
        int realResult = methods.findMin(array);
        if(expectedResult == realResult){
            System.out.println("shouldFindMinNumber - Test OK");
        }else {
            System.out.println("shouldFindMinNumber - Test FAIL");
        }
    }
}
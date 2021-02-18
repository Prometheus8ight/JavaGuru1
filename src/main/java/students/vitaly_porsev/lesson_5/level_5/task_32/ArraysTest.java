package students.vitaly_porsev.lesson_5.level_5.task_32;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
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
}

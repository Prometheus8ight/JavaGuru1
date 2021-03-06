package students.alex_kalashnikov.lesson_6.level_7.task_32;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest newTestObject = new FizzBuzzTest();
        newTestObject.detectFizzBuzzTest();
        newTestObject.detectFizzTest();
        newTestObject.detectBuzzTest();
        newTestObject.detectNone();
    }

    void test(int number, String expectedResult) {
        FizzBuzz newTest = new FizzBuzz();
        String realResult = newTest.detect(number);
        if (realResult.equals(expectedResult)) {
            System.out.println(expectedResult + " detectTest is OK!");
        }
        else {
            System.out.println(expectedResult + " detectTest is FAILED!");
        }
    }

    void detectFizzBuzzTest() {
        test(15,"FizzBuzz");
    }

    void detectFizzTest() {
        test(9,"Fizz");
    }

    void detectBuzzTest() {
        test(20,"Buzz");
    }

    void detectNone() {
        test(22,"" + 22);
    }

}

package students.julija_katukova.lesson_6.level_7.task_32;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.number1();
        fizzBuzzTest.number2();
        fizzBuzzTest.number3();
        fizzBuzzTest.number4();
    }

    public void number1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        check(realResult, "FizzBuzz", "Number Test1");
    }

    public void number2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(6);
        check(realResult, "Fizz", "Number Test2");
    }

    public void number3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        check(realResult, "Buzz", "Number Test3");
    }

    public void number4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(7);
        check(realResult, "7", "Number Test4");
    }

    public void check (String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

}

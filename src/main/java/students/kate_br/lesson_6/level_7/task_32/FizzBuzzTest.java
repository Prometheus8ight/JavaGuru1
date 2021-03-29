package students.kate_br.lesson_6.level_7.task_32;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest(15);
        test.fizzTest(21);
        test.buzzTest(20);
        test.numberTest(23);
    }

    public void fizzBuzzTest(int number) {

        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        checkTestResult(expectedResult, realResult, "Fizz Buzz Test");
    }

    public void fizzTest(int number) {

        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        checkTestResult(expectedResult, realResult, "Fizz Test");
    }

    public void buzzTest(int number) {

        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        checkTestResult(expectedResult, realResult, "Buzz Test");
    }

    public void numberTest(int number) {

        String expectedResult = "Number: " + number;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        checkTestResult(expectedResult, realResult, "Number Test");
    }

    private void checkTestResult(String expectedResult, String realResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test FAIL");
        }
    }
}

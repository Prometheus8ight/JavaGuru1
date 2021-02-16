package students.julija_katukova.lesson_4.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detectTest();
    }

    public void detectTest() {
        int number = 9;
        String expectedResult = "Fizz";
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        String realResult = FizzBuzz.detect(number);
        check(realResult, expectedResult, "Fizz");

        number = 20;
        expectedResult = "Buzz";
        realResult = FizzBuzz.detect(number);
        check(realResult, expectedResult, "Buzz");

        number = 15;
        expectedResult = "FizzBuzz";
        realResult = FizzBuzz.detect(number);
        check(realResult, expectedResult, "Buzz");

        number = 11;
        expectedResult = "11";
        realResult = FizzBuzz.detect(number);
        check(realResult, expectedResult, "Buzz");

    }
    public void check (String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}

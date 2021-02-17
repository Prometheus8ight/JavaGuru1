package students.vitaly_porsev.lesson_4.level_7.task_22;

class FizzBuzzTest {

    public void FizzTest() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(12);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void BuzzTest() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void FizzBuzzT() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    public void NumTest() {
        String expectedResult = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(1);
        if (realResult.equals(expectedResult)) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}

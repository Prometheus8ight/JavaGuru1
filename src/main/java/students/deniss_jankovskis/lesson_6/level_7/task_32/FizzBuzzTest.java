package students.deniss_jankovskis.lesson_6.level_7.task_32;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.checkFizz();
        test.checkBuzz();
        test.checkFizzBuzz();
    }

    public void checkFizz() {

        String expectedResult = "Fizz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String realResult = fizzBuzzTest.detect(99);

        if (realResult.equals(expectedResult)) {
            System.out.println("Check Fizz: Test OK");
        } else {
            System.out.println("Check Fizz Test: Test FAIL");
        }

    }


    public void checkBuzz() {

        String expectedResult = "Buzz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String realResult = fizzBuzzTest.detect(500);

        if (realResult.equals(expectedResult)) {
            System.out.println("Check Buzz: Test OK");
        } else {
            System.out.println("Check Buzz: Test FAIL");
        }

    }


    public void checkFizzBuzz() {

        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String realResult = fizzBuzzTest.detect(150);

        if (realResult.equals(expectedResult)) {
            System.out.println("Check FizzBuzz: Test OK");
        } else {
            System.out.println("Check FizzBuzz: Test FAIL");
        }

    }
}






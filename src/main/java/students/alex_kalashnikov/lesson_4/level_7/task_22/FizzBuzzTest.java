package students.alex_kalashnikov.lesson_4.level_7.task_22;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.noneTest();

    }

    public void fizzTest() {
        int number = 9;
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("fizzTest is OK");
        } else {
            System.out.println("fizzTest is FAILED");
        }
    }

    public void buzzTest() {
        int number = 20;
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("buzzTest is OK");
        } else {
            System.out.println("buzzTest is FAILED");
        }
    }

    public void fizzBuzzTest() {
        int number = 15;
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult == expectedResult) {
            System.out.println("fizzBuzzTest is OK");
        } else {
            System.out.println("fizzBuzzTest is FAILED");
        }
    }

    public void noneTest() {
        int number = 17;
        String expectedResult = "" + number;           // не получается приравнять return "" + number == String expectedResult = "" + number
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number); {
            if (realResult == expectedResult) {
                System.out.println("noneTest is OK");
            } else {
                System.out.println("noneTest is FAILED");
            }
        }
    }
}
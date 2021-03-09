package students.lolita_polakova.lesson_4.level_7.task_22;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.numberTest();
    }

    public void fizzBuzzTest() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (realResult.equals(expectedResult)) {
            System.out.println("FizzBuzz Test = OK");
        } else {
            System.out.println("FizzBuzz Test = FAIL");
        }
    }

    public void fizzTest() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(12);
        if (realResult.equals(expectedResult)) {
            System.out.println("Fizz Test = OK");
        } else {
            System.out.println("Fizz Test = FAIL");
        }
    }

    public void buzzTest() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        if (realResult.equals(expectedResult)) {
            System.out.println("Buzz Test = OK");
        } else {
            System.out.println("Buzz Test = FAIL");
        }
    }

    public void numberTest() {
        String expectedResult = "7";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(7);
        if (realResult.equals(expectedResult)) {
            System.out.println("Number Test = OK");
        } else {
            System.out.println("Number Test = FAIL");
        }
    }
}
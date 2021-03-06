package students.andrew_galashin.lesson_6.level_6.task_31;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest start = new FizzBuzzTest();
        start.fizz();
        start.buzz();
        start.fizzBuzz();

    }

    void fizz() {
        FizzBuzz start = new FizzBuzz();
        fizzTest(start.detect(33), "Fizz Test");
    }

    void buzz() {
        FizzBuzz start = new FizzBuzz();
        buzzTest(start.detect(20), "Buzz Test");
    }

    void fizzBuzz() {
        FizzBuzz start = new FizzBuzz();
        fizzBuzzTest(start.detect(15), "FizzBuzz Test");
    }

    void fizzTest(String answer, String testName) {
        if (answer.equals("Fizz")) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

    void buzzTest(String answer, String testName) {
        if (answer.equals("Buzz")) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

    void fizzBuzzTest(String answer, String testName) {
        if (answer.equals("FizzBuzz")) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}

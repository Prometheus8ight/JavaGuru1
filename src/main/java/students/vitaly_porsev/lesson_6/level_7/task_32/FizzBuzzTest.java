package students.vitaly_porsev.lesson_6.level_7.task_32;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest method = new FizzBuzzTest();
        method.checkFizz();
        method.checkBuzz();
        method.checkFizzBuzz();
    }

    void checkFizz() {
        FizzBuzz method = new FizzBuzz();
        checkFizzTest(method.detect(99), "checkFizz");
    }

    void checkBuzz() {
        FizzBuzz method = new FizzBuzz();
        checkBuzzTest(method.detect(100), "checkBuzz");
    }

    void checkFizzBuzz() {
        FizzBuzz method = new FizzBuzz();
        checkFizzBuzzTest(method.detect(15), "checkFizzBuzz");
    }

    void checkFizzTest(String answer, String testName) {
        if (answer.equals("Fizz")) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkBuzzTest(String answer, String testName) {
        if (answer.equals("Buzz")) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkFizzBuzzTest(String answer, String testName) {
        if (answer.equals("FizzBuzz")) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
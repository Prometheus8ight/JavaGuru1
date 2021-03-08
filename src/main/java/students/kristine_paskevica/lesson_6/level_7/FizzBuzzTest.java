package students.kristine_paskevica.lesson_6.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest method = new FizzBuzzTest();
        method.checkFizz();
        method.checkBuzz();
        method.checkFizzBuzz();
    }

    void checkFizz() {
        FizzBuzz method = new FizzBuzz();
        checkFizzTest(method.detect(99), "Pārbauda Fizz");
    }

    void checkBuzz() {
        FizzBuzz method = new FizzBuzz();
        checkBuzzTest(method.detect(100), "Pārbauda Buzz");
    }

    void checkFizzBuzz() {
        FizzBuzz method = new FizzBuzz();
        checkFizzBuzzTest(method.detect(15), "Pārbauda FizzBuzz");
    }

    void checkFizzTest(String answer, String testName) {
        if (answer.equals("Fizz")) {
            System.out.println(testName + " - ir patiess");
        } else {
            System.out.println(testName + " - nav patiess");
        }
    }

    void checkBuzzTest(String answer, String testName) {
        if (answer.equals("Buzz")) {
            System.out.println(testName + " - ir patiess");
        } else {
            System.out.println(testName + " - nav patiess");
        }
    }

    void checkFizzBuzzTest(String answer, String testName) {
        if (answer.equals("FizzBuzz")) {
            System.out.println(testName + " - ir patiess");
        } else {
            System.out.println(testName + " - nav patiess");
        }
    }
}

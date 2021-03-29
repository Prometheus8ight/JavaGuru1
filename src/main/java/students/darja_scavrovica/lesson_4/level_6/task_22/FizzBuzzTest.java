package students.darja_scavrovica.lesson_4.level_6.task_22;

class FizzBuzzTest {
     public static void main(String[] args) {
         FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
         fizzBuzzTest.fizzTest();
         fizzBuzzTest.buzzTest();
         fizzBuzzTest.buzzFizzTest();
         fizzBuzzTest.numberTest();
     }

    public void buzzFizzTest() {
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect( 15);
        if (realResult == expectedResult) {
            System.out.println("Test = TRUE");
        } else {
            System.out.println("Test = FALSE");
        }
    }
    public void buzzTest() {
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(25);
        if (realResult == expectedResult) {
            System.out.println("Test = TRUE");
        } else {
            System.out.println("Test = FALSE");
        }
    }
    public void fizzTest() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);
        if (realResult == expectedResult) {
            System.out.println("Test = TRUE");
        } else {
            System.out.println("Test = FALSE");
        }
    }
    public void numberTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(11);
        if (realResult != "FizzBuzz"&&realResult != "Fizz"&&realResult != "Buzz") {
            System.out.println("Test = TRUE");
        } else {
            System.out.println("Test = FALSE");
        }
    }


     }


package students.deniss_jankovskis.lesson_4.level_7;

public class FizzBuzzTest {


    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.noFizzBuzzTest();

    }


        public void fizzTest() {

            String expectedResult = "Fizz";
            FizzBuzz fizzBuzzTest = new FizzBuzz();
            String realResult = fizzBuzzTest.detect(3);

            if (realResult.equals(expectedResult)) {
                System.out.println("FizzTest has passed!");
            } else {
                System.out.println("FizzTest has failed!");
            }

        }


        public void buzzTest () {

            String expectedResult = "Buzz";
            FizzBuzz fizzBuzzTest = new FizzBuzz();
            String realResult = fizzBuzzTest.detect(10);

            if (realResult.equals(expectedResult)) {
                System.out.println("BuzzTest has passed!");
            } else {
                System.out.println("BuzzTest has failed!");
            }

        }


        public void fizzBuzzTest () {

            String expectedResult = "FizzBuzz";
            FizzBuzz fizzBuzzTest = new FizzBuzz();
            String realResult = fizzBuzzTest.detect(30);

            if (realResult.equals(expectedResult)) {
                System.out.println("FizzBuzzTest has passed!");
            } else {
                System.out.println("FizzBuzzTest has failed!");
            }

        }

        public void noFizzBuzzTest() {

            String expectedResult = "noFizzBuzz";
            FizzBuzz fizzBuzzTest = new FizzBuzz();
            String realResult = fizzBuzzTest.detect(0);

            if (realResult.equals(expectedResult)) {
                System.out.println("noFizzBuzzTest has passed!");
            } else {
                System.out.println("noFizzBuzzTest has has failed!");
            }

        }



}



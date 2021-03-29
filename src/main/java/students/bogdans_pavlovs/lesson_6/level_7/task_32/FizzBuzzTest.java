package students.bogdans_pavlovs.lesson_6.level_7.task_32;

class FizzBuzzTest {


    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();

    }

    public void testFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);
        String expectedResult = "Fizz";
        check(realResult, expectedResult, "Fizz TEST");
    }

    public void testBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(5);
        String expectedResult = "Buzz";
        check(realResult, expectedResult, "Buzz TEST");
    }

    public void testFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        String expectedResult = "FizzBuzz";
        check(realResult, expectedResult, "FizzBuzz TEST");
    }

    public void check(String expectedResult, String realResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}

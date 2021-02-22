package students.andrew_galashin.lesson_4.level_7.task_22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testNoFizzBuzz();
    }
    public void testFizz() {
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String result = fizzBuzzTest.detect(3);
        if (expectedResult == result) {
            System.out.println("Fizz test is OK");
        }
        else {
            System.out.println("Fizz test FAIL");
        }
    }
    public void testBuzz(){
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String result = fizzBuzzTest.detect(5);
        if (expectedResult == result){
            System.out.println("Buzz test is OK");
        }
        else {
            System.out.println("Buzz test FAIL");
        }
    }
    public void testFizzBuzz(){
        String expectedResult = "FizzBuzz"; //Не могу понять почему FizzBuzz FAIL
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String result = fizzBuzzTest.detect(15);
        if (expectedResult == result){
            System.out.println("FizzBuzz test is OK");
        }
        else {
            System.out.println("FizzBuzz test FAIL");
        }
    }
    public void testNoFizzBuzz(){
        String expectedResult = "Error";
        FizzBuzz fizzBuzzTest = new FizzBuzz();
        String result = fizzBuzzTest.detect(0);
        if (expectedResult == result){
            System.out.println("Error test is OK");
        }
        else {
            System.out.println("Error test FAIL");
        }
    }
}

package students.bogdans_pavlovs.lesson_4.level_7.task_22;

class FizzBuzzTest {

    public static void main(String[] args) {

        //Создайте класс FizzBuzzTest и напишите автоматические тесты, которые покрывают все возможные сценарии.

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.testFizz();
        fizzBuzzTest.testBuzz();
        fizzBuzzTest.testFizzBuzz();
        fizzBuzzTest.testNoFizzBuzz();

    }

    public void testFizz(){

        String expectedResult = "Fizz";

        FizzBuzz fizzBuzzTest = new FizzBuzz();

        String realResult = fizzBuzzTest.detect(3);

        if (expectedResult == realResult){
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }

    }

    public void testBuzz(){

        String expectedResult = "Buzz";

        FizzBuzz fizzBuzzTest = new FizzBuzz();

        String realResult = fizzBuzzTest.detect(5);

        if (expectedResult == realResult){
            System.out.println("Buzz test = OK");
        } else {
            System.out.println("Buzz test = FAIL");
        }
    }

    public void testFizzBuzz(){

        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzzTest = new FizzBuzz();

        String realResult = fizzBuzzTest.detect(15);

        if (expectedResult == realResult){
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }

    public void testNoFizzBuzz(){

        FizzBuzz fizzBuzzTest = new FizzBuzz();

        String realResult = fizzBuzzTest.detect(0);

        if (realResult != "Fizz" && realResult != "Buzz" && realResult != "FizzBuzz"){
            System.out.println("Neither Fizz, nor Buzz test = OK");
        } else {
            System.out.println("Neither Fizz, nor Buzz test = FAIL");
        }


    }

}

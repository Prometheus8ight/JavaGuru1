package students.rodion_afanasjev.lesson_4.level_7.task_22;

class FizzBuzzTest {

    public void fizzTest(){
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(6);
        if (realResult.equals(expectedResult)){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void buzzTest(){
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(10);
        if (realResult.equals(expectedResult)){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void fizzBuzzTest(){
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (realResult.equals(expectedResult)){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void returnTest(){
        String expectedResult = "1";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(1);
        if (realResult.equals(expectedResult)){
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }
}

package students.arkadij.lesson_4.task_22;

class FizzBuzzTest {

    public void fizzTest(){
        String supposedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(18);
        if (realResult == supposedResult){
            System.out.println("Fizz test - OK!");
        } else {
            System.out.println("Fizz test - FAIL!");
        }
    }

    public void buzzTest(){
        String supposedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(20);
        if (realResult == supposedResult){
            System.out.println("Buzz test - OK!");
        } else {
            System.out.println("Buzz test - FAIL!");
        }
    }

    public void fizzBuzzTest(){
        String supposedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);
        if (realResult == supposedResult){
            System.out.println("FizzBuzz test - OK!");
        } else {
            System.out.println("FizzBuzz test - FAIL!");
        }
    }

    public void numberTest(){
        int supposedResult = 1; // change it on number [2] --> going to be FALSE
        FizzBuzz fizzBuzz = new FizzBuzz();
        int realResult = Integer.parseInt(fizzBuzz.detect(1));
        if (realResult == supposedResult){
            System.out.println("F&B return test - OK!");
        } else {
            System.out.println("F&B return test - FAIL!");
        }
    }

}

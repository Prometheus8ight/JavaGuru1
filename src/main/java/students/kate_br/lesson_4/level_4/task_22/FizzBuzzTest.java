package students.kate_br.lesson_4.level_4.task_22;

 class FizzBuzzTest {

     public static void main(String[] args) {
         FizzBuzzTest test = new FizzBuzzTest();
         test.fizzTest();
         test.buzzTest();
         test.fizzBuzzTest();
         test.numberTest();
     }

     public void fizzTest(){
         int number = 21;
         String expectedResult = "Fizz";
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(number);
         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void buzzTest(){
         int number = 20;
         String expectedResult = "Buzz";
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(number);
         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void fizzBuzzTest(){
         int number = 15;
         String expectedResult = "FizzBuzz";
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(number);
         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void numberTest(){
         int number = 20;
         String expectedResult = "Number: " + number;
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(number);
         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }


}

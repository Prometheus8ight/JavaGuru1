package students.kate_br.lesson_4.level_7.task_22;

 class FizzBuzzTest {

     public static void main(String[] args) {

         FizzBuzzTest test = new FizzBuzzTest();
         test.fizzTest();
         test.buzzTest();
         test.fizzBuzzTest();

     }

     public void fizzTest(){

         int num = 15;
         String expectedResult = "Fizz";
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(num);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void buzzTest(){

         int num = 20;
         String expectedResult = "Buzz";
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(num);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void fizzBuzzTest(){

         int num = 15;
         String expectedResult = "FizzBuzz";
         FizzBuzz fizzBuzz = new FizzBuzz();
         String realResult = fizzBuzz.detect(num);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }




}



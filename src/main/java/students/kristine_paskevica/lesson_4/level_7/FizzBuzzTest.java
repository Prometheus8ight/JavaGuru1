package students.kristine_paskevica.lesson_4.level_7;

 class FizzBuzzTest {

     public static void main(String[] args) {

         FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
         parbaudesTesti.testsFizz();
     }
         public void testsFizz () {
             String rezultParbaude = "Fizz";
             FizzBuzz fizzBuzz = new FizzBuzz();
             String realRezult = fizzBuzz.detect(3);

             if (rezultParbaude == realRezult) {
                 System.out.println("Fizz pārbaude ir OK");
             } else {
                 System.out.println("Fizz pārbaude nav OK");
             }

             FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
             parbaudesTesti.testsBuzz();
     }

     public void testsBuzz() {
            String rezultParbaude = "Buzz";
            FizzBuzz fizzBuzz = new FizzBuzz();
            String realRezult = fizzBuzz.detect(5);

            if (rezultParbaude == realRezult) {
                System.out.println("Buzz pārbaude ir OK");
            } else {
                System.out.println("Buzz pārbaude nav OK");
            }

            FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
            parbaudesTesti.testsBuzzFizz();
     }
     public void testsBuzzFizz() {
            String rezultParbaude = "BuzzFizz";
            FizzBuzz fizzBuzz = new FizzBuzz();
            String realRezult = fizzBuzz.detect(15);

            if (rezultParbaude == realRezult) {
                System.out.println("BuzzFizz pārbaude ir OK");
            } else {
                System.out.println("BuzzFizz pārbaude nav OK");
            }
            FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
            parbaudesTesti.testsNoBuzzFizz();
        }
      public void testsNoBuzzFizz(){
          FizzBuzz fizzBuzz = new FizzBuzz();
          String realRezult = fizzBuzz.detect(0);
          if (realRezult != "Buzz" && realRezult != "Fizz" && realRezult !="BuzzFizz"){
              System.out.println("Neatbilst nevienai izvēlei - ir OK");
          }
          else {
              System.out.println("Neatbilst nevienai izvēlei - nav OK");
          }
        }
}



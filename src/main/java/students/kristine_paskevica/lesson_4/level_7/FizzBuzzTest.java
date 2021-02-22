package students.kristine_paskevica.lesson_4.level_7;

 class FizzBuzzTest {

     public static void main(String[] args) {

         FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
         parbaudesTesti.testsFizz();
     }
         public void testsFizz () {
             FizzBuzz fizzBuzz = new FizzBuzz();
             String realRezult = fizzBuzz.detect(3);

             if ("Fizz".equals("Fizz")) {               //pārbauda vai pārbaudamā vērtība sakrīt ar doto vērtību
                 System.out.println("Fizz pārbaude ir OK");
             } else {
                 System.out.println("Fizz pārbaude nav OK");
             }

             FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
             parbaudesTesti.testsBuzz();
     }

     public void testsBuzz() {

            FizzBuzz fizzBuzz = new FizzBuzz();
            String realRezult = fizzBuzz.detect(5);

            if ("Buzz".equals("Buzz")) {
                System.out.println("Buzz pārbaude ir OK");
            } else {
                System.out.println("Buzz pārbaude nav OK");
            }

            FizzBuzzTest parbaudesTesti = new FizzBuzzTest();
            parbaudesTesti.testsBuzzFizz();
     }
     public void testsBuzzFizz() {

            FizzBuzz fizzBuzz = new FizzBuzz();
            String realRezult = fizzBuzz.detect(15);

            if ("BuzzFizz".equals("BuzzFizz")) {
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



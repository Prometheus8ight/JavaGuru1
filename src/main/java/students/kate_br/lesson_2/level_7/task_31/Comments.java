package students.kate_br.lesson_2.level_7.task_31;

class Comments {

     public static void main(String[] args) {
         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.println("Input s first integral number:");
         int firstNumber = scanner.nextInt();
         System.out.println("Input a second integral number:");
         int secondNumber = scanner.nextInt();

         //Умножение целых чисел
         System.out.println("Your result is:");
         int result = (firstNumber * secondNumber);
         System.out.println(result);

         System.out.println("Input a first real number:");
         double firstDoubleNumber = scanner.nextDouble();
         System.out.println("Input a second real number:");
         double secondDoubleNumber = scanner.nextDouble();

         //Умножение вещественных чисел
         System.out.println("Your result is:");
         double doubleResult = (firstDoubleNumber * secondDoubleNumber);
         System.out.println(doubleResult);

         /*
         Multiplication of integral numbers
         Multiplication of real numbers
         and bla-bla-bla
          */
         }
 }

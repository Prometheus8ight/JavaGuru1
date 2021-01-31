package students.kate_br.lesson_2.level_1.task_2;

 class Math2 {

     public static void main(String[] args) {

         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.println("Input first number:");
         double firstDoubleNumber = scanner.nextDouble();
         System.out.println("Input second number:");
         double secondDoubleNumber = scanner.nextDouble();

         System.out.printf("Addition:");
         System.out.println(firstDoubleNumber + secondDoubleNumber);
         System.out.printf("Subtraction");
         System.out.println(firstDoubleNumber - secondDoubleNumber);
         System.out.printf("Multiplication:");
         System.out.println(firstDoubleNumber * secondDoubleNumber);
         System.out.printf("Division");
         System.out.println(firstDoubleNumber / secondDoubleNumber);
     }
}

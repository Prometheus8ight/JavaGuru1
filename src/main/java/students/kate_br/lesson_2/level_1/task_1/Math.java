package students.kate_br.lesson_2.level_1.task_1;

 class Math {

     public static void main(String[] args) {

         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.println("Input first number:");
         int firstNumber = scanner.nextInt();
         System.out.println("Input second number:");
         int secondNumber = scanner.nextInt();



         System.out.printf("Addition:");
         System.out.println(firstNumber + secondNumber);
         System.out.printf("Subtraction:");
         System.out.println(firstNumber - secondNumber);
         System.out.printf("Multiplication:");
         System.out.println(firstNumber * secondNumber);
         System.out.printf("Division:");
         System.out.println(firstNumber / secondNumber);
     }
}

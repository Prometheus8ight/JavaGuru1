package students.kate_br.lesson_2.level_3.task_11;

 class Average {

     public static void main(String[] args) {

         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.println("Input a first number:");
         int a = scanner.nextInt();
         System.out.println("Input a second number:");
         int b = scanner.nextInt();
         System.out.println("Input s third number:");
         int c = scanner.nextInt();

         double d = 3.0;
         System.out.println("Your result is:");
         System.out.println( (a + b + c) / d);


     }
}

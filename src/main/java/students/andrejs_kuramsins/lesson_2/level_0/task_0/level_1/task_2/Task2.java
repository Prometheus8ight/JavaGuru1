package students.andrejs_kuramsins.lesson_2.level_0.task_0.level_1.task_2;

 class Task2 {
     public static void main(String[] args) {

         java.util.Scanner scanner = new java.util.Scanner(System.in);

         System.out.println("Введите пожалуйста вещественное число (с запятой) a : ");
         double a = scanner.nextDouble();

         System.out.println( "Введите пожалуйста вещественное число (с запятой) b : ");
         double b = scanner.nextDouble();

         double sum = a + b;
         System.out.println("Your number a + b =  " + sum );

         double sub = a - b;
         System.out.println("Your number a + b = " + sub );

         double multi = a * b;
         System.out.println("Your number a + b =  " + multi );

         double div = a / b;
         System.out.println("Your number a + b =  " + div );

     }
}

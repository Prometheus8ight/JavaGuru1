package students.kate_br.lesson_2.level_3.task_10;

 class Round {

     public static void main(String[] args) {
         System.out.println("Test Data");

         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.println("Radius:");
         double r = scanner.nextDouble();
         int a = 2;
         double pi = 3.14;

         System.out.printf("Perimeter is = ");
         System.out.println(a * pi * r);

         System.out.printf("Area is = ");
         System.out.println(pi * (r * r));

     }
}

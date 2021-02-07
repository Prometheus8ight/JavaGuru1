package students.kate_br.lesson_3._level_2.task_9;

 class HelloUsername {

     public static void main(String[] args) {
         java.util.Scanner scanner = new java.util.Scanner(System.in);
         System.out.println("What is your name?");
         String userName = scanner.nextLine();

         System.out.println("Hello " + userName + "!");
     }
 }

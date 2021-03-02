package students.kate_br.lesson_6.level_4.task_18;

import java.util.concurrent.TimeUnit;

class WhileInfiniteLoop {

     public static void main(String[] args) throws InterruptedException {

         System.out.println("Let's drinking coffee!");

         while (true){

             System.out.println("Let's drink!");
             System.out.println(System.currentTimeMillis());
             TimeUnit.SECONDS.sleep(2);
         }




     }

}

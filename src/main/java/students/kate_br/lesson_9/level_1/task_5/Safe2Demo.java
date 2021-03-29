package students.kate_br.lesson_9.level_1.task_5;

import java.util.Scanner;

class Safe2Demo {

     public static void main(String[] args) {

          Safe2 safe2 = new Safe2("qwerty", 10000.0);
          Scanner scanner = new Scanner(System.in);

          safe2.setMoney("qwerty", 3000.0);
          System.out.println(safe2);

          safe2.getMoney("qwerty", 20000.0);
          System.out.println(safe2);









     }
}

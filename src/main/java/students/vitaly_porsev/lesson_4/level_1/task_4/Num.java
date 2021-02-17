package students.vitaly_porsev.lesson_4.level_1.task_4;

import java.util.Scanner;

public class Num {

    String evenOrNotEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int num = scanner.nextInt();
        return num % 2 == 0 ? "Ваше число чётное!" : "Ваше число нечётное!";
    }
}

package students.nikita_bunevich.lesson_5.level_2.task_13;
import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numb = new int[3];
        int sum=0;
        for (int i = 0; i < 3; i++) {
            numb[i] = random.nextInt();
            sum += numb[i];
        }
            System.out.println("Сумма: " + sum+0);
        }
    }

package students.alex_kalashnikov.lesson_6.level_4.task_19;

import java.util.concurrent.TimeUnit;

class WhileInfiniteLoop {

    public static void main(String[] args) throws InterruptedException {

        int x = 1;

        while (x > 0) {
            x = x + 1;
            System.out.println(x);
            TimeUnit.SECONDS.sleep(1);
            if (x == 3) {
                break;
            }
        }
    }

}

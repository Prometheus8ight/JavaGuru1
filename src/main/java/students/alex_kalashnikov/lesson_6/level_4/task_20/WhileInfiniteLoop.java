package students.alex_kalashnikov.lesson_6.level_4.task_20;

import java.util.concurrent.TimeUnit;

class WhileInfiniteLoop {

    public static void main(String[] args) throws InterruptedException {

        int x = 1;

        while (x > 0) {
            if (x % 3 == 0) {
                x++;
                continue;
            }
            System.out.println(x);
            x++;
            TimeUnit.SECONDS.sleep(1);

        }
    }

}


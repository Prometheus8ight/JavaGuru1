package students.alex_kalashnikov.lesson_6.level_4.task_18;

import java.util.concurrent.TimeUnit;

class ForInfiniteLoop {

    public static void main(String[] args) throws InterruptedException {

        for (int x = 0; x >= 0; x++) {
            System.out.println(x);
            TimeUnit.SECONDS.sleep(1);
        }
    }

}

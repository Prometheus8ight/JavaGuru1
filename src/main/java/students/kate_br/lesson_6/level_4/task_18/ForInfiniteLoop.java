package students.kate_br.lesson_6.level_4.task_18;

import java.util.concurrent.TimeUnit;

class ForInfiniteLoop{

    public static void main(String[] args) throws InterruptedException {

        for (;;){

            System.out.println("Need more coffee!");
            System.out.println(System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(1);
        }


    }


}

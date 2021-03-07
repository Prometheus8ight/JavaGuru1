package students.bogdans_pavlovs.lesson_6.level_4.task_20;

class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){

            if (i % 2 == 0){

                continue;
            }

            System.out.println(i);
        }


    }

}

package students.bogdans_pavlovs.lesson_6.level_4.task_20;

class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;

        while (i >= 0 && i < 40){

            i++;

            if (i == 10 || i == 20 || i == 30){

                continue;

            }

            System.out.println(i);

        }


    }

}

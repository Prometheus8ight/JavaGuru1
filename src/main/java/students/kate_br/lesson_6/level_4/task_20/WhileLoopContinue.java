package students.kate_br.lesson_6.level_4.task_20;

class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }

            System.out.println(i);
            i++;


        }
    }
}

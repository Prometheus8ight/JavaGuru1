package students.vitaly_porsev.lesson_6.level_4.task_20;

class WhileLoopContinue {

    void infiniteWhile() {
        int num = 0;
        while (true) {
            if (num == 10) {
                continue;
            }
            System.out.print(num + " ");
            num++;
        }
    }
}

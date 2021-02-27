package students.vitaly_porsev.lesson_6.level_4.task_20;

class ForLoopContinue {

    void infiniteFor() {
        int num = 0;
        for (; ; ) {
            if (num == 10) {
                continue;
            }
            System.out.print(num + " ");
            num++;
        }
    }
}

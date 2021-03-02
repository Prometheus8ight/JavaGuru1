package students.vitaly_porsev.lesson_6.level_4.task_19;

class ForInfiniteLoopBreak {

    void infiniteFor() {
        int counter = 0;
        for (; ; ) {
            System.out.println("Hello!");
            counter++;
            if (counter > 10) {
                break;
            }
        }
    }
}

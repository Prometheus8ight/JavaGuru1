package students.vitaly_porsev.lesson_6.level_4.task_19;

class WhileInfiniteLoopBreak {

    void infiniteWhile() {
        int counter = 0;
        while (true) {
            System.out.println("Hello!");
            counter++;
            if (counter > 10) {
                break;
            }
        }
    }
}


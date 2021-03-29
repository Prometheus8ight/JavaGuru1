package students.arkadij.lesson_6.level_4.task_19;

class ForInfiniteLoopBreak {

    void forBreak(){
        int i = 1;
        for (;;){
            System.out.println("i = " + i + ";");
            i++;
            if (i == 22){
                break;
            }
        }
    }

    public static void main(String[] args) {
        ForInfiniteLoopBreak forInfiniteLoopBreak = new ForInfiniteLoopBreak();
        forInfiniteLoopBreak.forBreak();
    }

}

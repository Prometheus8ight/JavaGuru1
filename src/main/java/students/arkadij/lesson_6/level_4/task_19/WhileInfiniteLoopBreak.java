package students.arkadij.lesson_6.level_4.task_19;

class WhileInfiniteLoopBreak {

    void whileBreak(){
        int i = 1;
        while (true){
            System.out.println("i = " + i + ";");
            i++;
            if (i == 16){
                break;
            }
        }
    }

    public static void main(String[] args) {
        WhileInfiniteLoopBreak whileInfiniteLoopBreak = new WhileInfiniteLoopBreak();
        whileInfiniteLoopBreak.whileBreak();
    }

}

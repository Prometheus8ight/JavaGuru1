package students.arkadij.lesson_6.level_4.task_20;

class WhileLoopContinue {

    void whileContinue(){
        int i = 0;
        while (i < 10){
            if (i % 2 == 0){
                i++;
                continue;
            }
            System.out.println("i = " + i + ";");
            i++;
        }
    }

    public static void main(String[] args) {
        WhileLoopContinue whileLoopContinue = new WhileLoopContinue();
        whileLoopContinue.whileContinue();
    }

}

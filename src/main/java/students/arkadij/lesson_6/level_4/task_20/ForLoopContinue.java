package students.arkadij.lesson_6.level_4.task_20;

class ForLoopContinue {

    void forContinue(){
        for (int i = 0; i < 10; i++){
            if (i % 2 == 1){
                continue;
            }
            System.out.println("i = " + i + ";");
            i++;
        }
    }

    public static void main(String[] args) {
        ForLoopContinue forLoopContinue = new ForLoopContinue();
        forLoopContinue.forContinue();
    }

}

package students.arkadij.lesson_6.level_4.task_18;

class WhileInfiniteLoop {

    void whileC(){
        int i = 0;
        while (true){
            System.out.println("i = " + i + ";");
            i++;
        }
    }

    public static void main(String[] args) {
        WhileInfiniteLoop whileInfiniteLoop = new WhileInfiniteLoop();
        whileInfiniteLoop.whileC();
    }

}

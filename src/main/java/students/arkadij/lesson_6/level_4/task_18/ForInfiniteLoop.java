package students.arkadij.lesson_6.level_4.task_18;

class ForInfiniteLoop {

    void forC(){
        int i = 0;
        for (;;){
            System.out.println("i = " + i + ";");
            i++;
        }
    }

    public static void main(String[] args) {
        ForInfiniteLoop forInfiniteLoop = new ForInfiniteLoop();
        forInfiniteLoop.forC();
    }

}

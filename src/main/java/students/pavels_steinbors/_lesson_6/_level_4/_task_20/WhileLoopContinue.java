package students.pavels_steinbors._lesson_6._level_4._task_20;

public class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;
        while (i < 50) {
            if (i == 5) break;
            System.out.println("i = " + i);
            i++;
        }
    }

}

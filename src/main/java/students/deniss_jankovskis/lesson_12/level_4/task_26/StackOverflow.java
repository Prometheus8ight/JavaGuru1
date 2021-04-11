package students.deniss_jankovskis.lesson_12.level_4.task_26;

class StackOverflow {

    public static void main(String[] args) {
        StackOverflow.recursive(10);
    }

    public static void recursive(int num) {
        System.out.println("Number: " + num);

        if (num == 0)
            return;
        else
            recursive(++num);
    }
}


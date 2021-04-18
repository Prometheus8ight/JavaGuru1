package students.andrew_galashin.lesson_12.level_4.task_26;

class StackOverflowError {

    public static void main(String[] args) {
        System.out.println(repeat(50));
    }

    public static int repeat(int x) {
        return repeat(x + x);
    }

}

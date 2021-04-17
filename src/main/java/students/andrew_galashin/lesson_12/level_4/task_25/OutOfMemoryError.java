package students.andrew_galashin.lesson_12.level_4.task_25;

class OutOfMemoryError {
    public static void main(String[] args) throws InterruptedException {
        print(1);
    }

    static void print(int x) {
        if (x < 10000000) {
            print(x + 1);
        }
    }

}

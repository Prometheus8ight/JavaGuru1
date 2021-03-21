package students.andrew_galashin.lesson_6.level_4;

public class Task_18 {
    static class WhileInfiniteLoop {
        public static void main(String[] args) {
            while (true) {
                System.out.println("Hi");
            }
        }
    }

    static class ForInfiniteLoop {
        public static void main(String[] args) {
            for (int i = 1; i > 0; i++) {
                System.out.println("Hi");
            }

        }
    }
}

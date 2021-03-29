package students.andrew_galashin.lesson_6.level_4;

class Task_19 {
    static class WhileInfiniteLoopBreak {
        public static void main(String[] args) {
            while (true) {
                System.out.println("Hi");
                break;
            }
        }
    }

    static class ForInfiniteLoopBreak {
        public static void main(String[] args) {
            for (int i = 1; i > 0; i++) {
                System.out.println("Hi");
                break;
            }

        }
    }
}
package students.andrew_galashin.lesson_6.level_4;

class Task_20 {
    static class WhileInfiniteLoopBreak {
        public static void main(String[] args) {
            int i = 0;
            while (i < 10) {
                if (i == 10) {
                    continue;
                }
                System.out.println(i);
                i++;
            }
            System.out.println("END");
        }
    }

    static class ForInfiniteLoopBreak {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                if (i == 10) {
                    continue;
                }
                System.out.println(i);
                i++;
            }
            System.out.println("END");
        }
    }
}


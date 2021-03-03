package students.kate_br.lesson_6.level_4.task_19;


class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        System.out.println("Let's drink coffee!");

        while (true) {
            System.out.println("Let's drink!");
            break;
        }

        System.out.println("Coffee is over :(");
        System.out.println("Need more!");
    }
}

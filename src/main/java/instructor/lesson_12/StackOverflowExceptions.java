package instructor.lesson_12;

class StackOverflowExceptions {

    public static void main(String[] args) {

        printNext(1);

    }

    static void printNext(int n) {
        System.out.println(n);

        if (n < 10) {
            printNext(n + 1);
        }
    }

}

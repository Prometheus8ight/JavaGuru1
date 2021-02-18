package students.alex_kalashnikov.lesson_5.level_2.task_11;

class ArrayInt {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();

        int[] numbers = {prompter.enterNumber(), prompter.enterNumber(), prompter.enterNumber()};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index[" + i + "]: " + numbers[i]);
        }
    }

}
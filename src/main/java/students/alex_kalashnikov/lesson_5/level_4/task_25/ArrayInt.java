package students.alex_kalashnikov.lesson_5.level_4.task_25;

class ArrayInt {

    public static void main(String[] args) {

        Prompter number = new Prompter();

        int[] arrayInt = new int[number.promptArrayLength()];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = number.promptArrayValues();
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Index [" + i + "]: " + arrayInt[i]);
        }
    }

}

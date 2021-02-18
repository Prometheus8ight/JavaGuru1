package students.alex_kalashnikov.lesson_5.level_4.task_28;

class ArrayIntMin {

    public static void main(String[] args) {

        Prompter number = new Prompter();

        int[] arrayInt = new int[number.promptArrayLength()];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.pow(-2, 31) + (Math.random() * Math.pow(2, 32)));
        }

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Index [" + i + "]: " + arrayInt[i]);
        }

        int min = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }

        System.out.println("Min number in Array is: " + min);

    }

}
package students.alex_kalashnikov.lesson_6.level_3.task_15;

class ArrayService {



    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3);
        }

    }

    boolean replaceAll(int[] array, int numberToReplace, int newNumber) {
        boolean replaced = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                replaced = true;
            }
        }
        return replaced;
    }

}
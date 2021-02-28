package students.alex_kalashnikov.lesson_6.level_3.task_14;

class ArrayService {

    boolean replaced;

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3);
        }

    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                replaced = true;
                break; // прерывает цикл после первой замены числа
            }
        }
        return replaced;
    }

}
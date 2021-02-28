package students.alex_kalashnikov.lesson_6.level_3.task_12;

class ArrayService {

    boolean containInteger;

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

    }

    boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return containInteger = true;
            }
            if (containInteger == true) {                       // прерывает цикл, если число найдено в массиве
                break;
            }
        }
        return containInteger;
    }
}

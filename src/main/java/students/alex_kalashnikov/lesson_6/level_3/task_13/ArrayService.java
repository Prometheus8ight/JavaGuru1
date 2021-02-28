package students.alex_kalashnikov.lesson_6.level_3.task_13;

class ArrayService {

    int amount;

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 3);
        }

    }

    int countOccurrences(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                amount++;
            }
        }
        return amount;
    }

}

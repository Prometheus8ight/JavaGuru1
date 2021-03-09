package students.alex_kalashnikov.lesson_7.level_6.task_12;

class ArrayCopy {

    public int[] create(int length) {
        return new int[length];
    }

    public int[] fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -100 + (int) (Math.random() * 200);
        }
        return array;
    }

    private int countRangeNumbers(int[] array, int numberFrom, int numberTo) {
        int rangeNumberCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo) {
                rangeNumberCounter++;
            }
        }
        return rangeNumberCounter;
    }

    private int[] copyRangeNumbers(int[] array, int numberFrom, int numberTo) {
        int[] rangeNumberArray = create(countRangeNumbers(array, numberFrom, numberTo));
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo) {
                rangeNumberArray[counter] = array[i];
                counter++;
            }

        }
        return rangeNumberArray;
    }

    public int[] copyInRange(int[] array, int numberFrom, int numberTo) {
        return copyRangeNumbers(array, numberFrom, numberTo);
    }

}
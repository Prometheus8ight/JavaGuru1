package students.alex_kalashnikov.lesson_7.level_6.task_12;

class ArrayCopy {

    int[] create(int length) {
        return new int[length];
    }

    int[] fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -100 + (int) (Math.random() * 200);
        }
        return array;
    }

    int countRangeNumbers(int[] array, int numberFrom, int numberTo) {
        int rangeNumberCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= numberFrom && array[i] <= numberTo) {
                rangeNumberCounter++;
            }
        }
        return rangeNumberCounter;
    }

    int[] copyRangeNumbers(int[] array, int numberFrom, int numberTo) {
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

    int[] copyInRange(int[] array, int numberFrom, int numberTo) {
        return copyRangeNumbers(array, numberFrom, numberTo);
    }

}
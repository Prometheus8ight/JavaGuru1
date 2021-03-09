package students.vitaly_porsev.lesson_7.level_6.task_12;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int counter = 0;
        int[] newArray = new int[findNeededLength(in, numberFrom, numberTo)];
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                newArray[counter] = i;
                counter++;
            }
        }
        return newArray;
    }

    private int findNeededLength(int[] array, int numberFrom, int numberTo) {
        int counter = 0;
        for (int num : array) {
            if (num >= numberFrom && num <= numberTo) {
                counter++;
            }
        }
        return counter;
    }
}
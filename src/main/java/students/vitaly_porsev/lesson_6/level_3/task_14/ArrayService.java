package students.vitaly_porsev.lesson_6.level_3.task_14;

class ArrayService {

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        boolean trueOrNot = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                trueOrNot = true;
                break;
            }
        }
        return trueOrNot;
    }
}

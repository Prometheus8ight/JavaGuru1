package students.deniss_jankovskis.lesson_6.level_3.task_14;

class ArrayService {

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        boolean checkNumber = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                checkNumber = true;
                break;
            }
        }
        return checkNumber;
    }
}




package students.julija_katukova.lesson_6.level_3.task_14;

class ArrayService {
    public boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                check = true;
                break;
            }
        }
        return check;
    }
}

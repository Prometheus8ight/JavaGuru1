package students.arkadij.lesson_6.level_3.task_13;

class ArrayService {

    int countOccurrences(int[] arr, int numberToSearch){
        int counter = 0;
        for (int number : arr){
            if (number == numberToSearch){
                counter++;
            }
        }
        return counter;
    }

}

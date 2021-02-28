package students.kate_br.lesson_6.level_3.task_15;

class ArrayService {

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {

        int count = 0;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }

        return count;

    }

}



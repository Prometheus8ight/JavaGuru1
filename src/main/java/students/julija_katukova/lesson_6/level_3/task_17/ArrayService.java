package students.julija_katukova.lesson_6.level_3.task_17;

class ArrayService {
    void sort(int[] arr){ // Очень гурстно, что нельзя через Arrays.sort(arr) 
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr [j]){ //in ascending order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

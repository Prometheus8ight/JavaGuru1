package students.deniss_jankovskis.lesson_7.task_12;

class ArrayCopy {


    int[] copyInRange(int[] arr, int numberFrom, int numberTo) {
        int count = 0;
        for (int i : arr) {
            if (i > numberFrom - 1 && i < numberTo + 1) {
                count++;
            }
        }
        int[] finalArray = new int[count];
        int index = 0;
        for (int j : arr) {
            if (j > numberFrom - 1 && j < numberTo + 1) {
                finalArray[index] = j;
                index++;
            }
        }
        return finalArray;
    }


}

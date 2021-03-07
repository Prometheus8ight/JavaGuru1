package students.julija_katukova.lesson_7.level_6.task_12;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] out = new int[(numberTo + 1) - numberFrom];
        int j = 0;
        for (int i = numberFrom; i < (numberTo + 1); i++) {
            out[j] = in[i];
            j++;
        }
        return out;
    }
}

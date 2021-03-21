package students.andrew_galashin.lesson_6.level_3.task_13;

class ArrayService {
    public boolean contains(int[] arr, int numberToSearch) {
        boolean check = false;
        for (int i : arr) {
            if (i == numberToSearch) {
                check = true;
                break;
            }

        }
        return check;
    }

    public int occurrences(int[] arr, int numberToSearch) {
        int x = 0;
        for (int i : arr) {
            if (i == numberToSearch) {
                x++;
            }
        }
        return x;
    }
}

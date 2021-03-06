package students.andrew_galashin.lesson_6.level_3.task_12;

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
}

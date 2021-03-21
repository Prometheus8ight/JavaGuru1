package students.andrew_galashin.lesson_6.level_3.task_17;

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

    public boolean replacement(int[] arr, int numberToSearch, int number) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                arr[i] = number;
                check = true;
                break;
            }
        }
        return check;
    }

    public int replacementAll(int[] arr, int numberToReplace, int number) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = number;
                x++;
            }
        }
        return x;
    }

    public void coup(int[] arr) {
        int x;
        int y = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            x = arr[i];
            arr[i] = arr[y];
            arr[y] = x;
            y--;
        }
    }

    public void sort(int[] arr) {
        int x;
        for (int i = 1; i < arr.length; i++) {
            for (int y = i; y > 0; y--) {
                if (arr[y] < arr[y - 1]) {
                    x = arr[y];
                    arr[y] = arr[y - 1];
                    arr[y - 1] = x;
                }
            }
        }
    }
}

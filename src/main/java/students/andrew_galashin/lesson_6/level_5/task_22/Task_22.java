package students.andrew_galashin.lesson_6.level_5.task_22;

class Task_22 {
    public boolean horizontal(int[][] x, int check) {
        for (int i = 0; i < x.length; i++) {
            int j = 0;
            for (int a = 0; a < x[i].length; a++) {
                if (x[i][a] == check) {
                    j++;
                    if (j == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

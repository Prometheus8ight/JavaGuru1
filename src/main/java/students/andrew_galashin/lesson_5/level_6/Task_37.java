package students.andrew_galashin.lesson_5.level_6;

class Task_37 {
    class Arrays {

        public int findMin(int[] array) {

            int min = array[0];
            for (int x : array) {
                if (x < min) {
                    min = x;
                }
            }
            return min;

        }
    }
}
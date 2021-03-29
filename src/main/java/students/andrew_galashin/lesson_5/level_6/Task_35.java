package students.andrew_galashin.lesson_5.level_6;

class Task_35 {
    class Arrays {

        public int findMax(int[] array) {

            int max = array[0];
            for (int x : array){
                if(x > max){
                    max = x;
                }
            }
            return max;
        }

    }
}

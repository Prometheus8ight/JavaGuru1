package students.vitaly_porsev.lesson_5.level_6.task_35;

class Arrays {

    public int findMax(int[] array) {
        int max = 0;
        for(int num : array){
            if(num > max){
                max = num;
            }
        }return max;
    }

}

package students.vitaly_porsev.lesson_5.level_6.task_37;

class Arrays {

    public int findMin(int[] array) {
        int minNum = array[0];
        for(int num : array){
            if(num < minNum){
                minNum = num;
            }
        }return minNum;
    }

}

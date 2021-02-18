package students.vitaly_porsev.lesson_5.level_6.task_38;

public class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public int findMax(int[] array) {
        int max = 0;
        for(int num : array){
            if(num > max){
                max = num;
            }
        }return max;
    }

    public int findMin(int[] array) {
        int minNum = array[0];
        for(int num : array){
            if(num < minNum){
                minNum = num;
            }
        }return minNum;
    }
}

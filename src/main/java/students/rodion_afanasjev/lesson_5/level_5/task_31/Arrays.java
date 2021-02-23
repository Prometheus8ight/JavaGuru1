package students.rodion_afanasjev.lesson_5.level_5.task_31;
import java.util.Random;

class Arrays {

    public int[] create(int length){
        return new int[length];
    }

    public void fillRandomly(int[] array){
        Random random = new Random();
        for ( int i = 0; i < array.length; i++){
            array[i] = random.nextInt(10);
        }
        System.out.println(java.util.Arrays.toString(array));
    }

    public void print(int[] array){
        System.out.println(java.util.Arrays.toString(array));
    }

    public int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}

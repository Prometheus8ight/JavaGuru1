package students.alex_kalashnikov.lesson_5.level_6.task_36;

class Arrays {

    public int[] create(int length) {
        return new int[length];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.pow(-2,31) + (Math.random() * Math.pow(2,32)));
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index[" + i + "]: " + array[i]);
        }
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
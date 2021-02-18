package students.vitaly_porsev.lesson_5.level_5.task_33;

class ArraysDemo {
    public static void main(String[] args) {
        Arrays methods = new Arrays();

        int[] array = new int[10];

        methods.fillRandomly(array);

        System.out.println(java.util.Arrays.toString(array));
    }
}

package students.alex_kalashnikov.lesson_5.level_5.task_33;

class ArraysDemo {

    public static void main(String[] args) {

        Arrays object = new Arrays();

        int[] array = object.create(5);

        object.fillRandomly(array);

        System.out.println("Array length: " + array.length);
        System.out.println("==============================================");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index[" + i + "]: " + array[i]);
        }
    }

}

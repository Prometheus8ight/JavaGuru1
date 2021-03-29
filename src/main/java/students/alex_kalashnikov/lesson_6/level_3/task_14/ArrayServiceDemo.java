package students.alex_kalashnikov.lesson_6.level_3.task_14;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService object = new ArrayService();

        int[] array = object.create(5);
        object.fillRandomly(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index [" + i + "]: " + array[i]);
        }

        System.out.println("==============");

        System.out.println("Number was found and replaced: " + object.replaceFirst(array,2,-5));

        System.out.println("==============");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index [" + i + "]: " + array[i]);
        }
    }

}
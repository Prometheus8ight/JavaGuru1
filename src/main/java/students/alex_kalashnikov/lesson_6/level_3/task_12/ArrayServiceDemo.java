package students.alex_kalashnikov.lesson_6.level_3.task_12;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService object = new ArrayService();

        int[] array = object.create(10);
        object.fillRandomly(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index [" + i + "]: " + array[i]);
        }

        System.out.println("==============");

        object.contains(array, 2);

        System.out.println(object.contains(array,2));

    }

}


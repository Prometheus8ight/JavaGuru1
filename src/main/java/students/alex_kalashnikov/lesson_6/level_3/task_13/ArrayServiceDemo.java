package students.alex_kalashnikov.lesson_6.level_3.task_13;

class ArrayServiceDemo {

    public static void main(String[] args) {

        ArrayService object = new ArrayService();

        int[] array = object.create(5);
        object.fillRandomly(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Index [" + i + "]: " + array[i]);
        }

        System.out.println("==============");

        System.out.println("Occurrences of Integer X in Array are: " + object.countOccurrences(array,2));
        System.out.println("Occurrences of Integer X in Array are: " + object.countOccurrences(array,2));
    }

}
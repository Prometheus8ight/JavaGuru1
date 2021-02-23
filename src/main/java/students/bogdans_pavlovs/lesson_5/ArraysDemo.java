package students.bogdans_pavlovs.lesson_5;

class ArraysDemo {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();

        int[] array = arrays.create(5);

        System.out.println("Array length: " + array.length);

        arrays.fillRandomly(array);

        System.out.print("Array contains: ");
        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + "; ");
        }

    }
}

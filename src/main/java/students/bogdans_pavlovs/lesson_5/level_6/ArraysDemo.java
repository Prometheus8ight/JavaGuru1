package students.bogdans_pavlovs.lesson_5.level_6;

//Демо, для тестов перед тестами :D

class ArraysDemo {

    public static void main(String[] args) {

        Arrays arrays = new Arrays();

        int[] array = arrays.create(5);
        System.out.println("Array length: " + array.length);

        arrays.fillRandomly(array);
        arrays.print(array);
        arrays.findMax(array);
        arrays.findMin(array);


    }
}


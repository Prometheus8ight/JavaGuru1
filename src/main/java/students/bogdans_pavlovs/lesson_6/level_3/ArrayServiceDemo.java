package students.bogdans_pavlovs.lesson_6.level_3;

class ArrayServiceDemo { // dlja testov pered napisaniem testov

    public static void main(String[] args) {

        ArrayService arrayService = new ArrayService();
        String result1 = String.valueOf(arrayService.contains(new int[]{1, 2, 3, 4, 5}, 3));
        System.out.println(result1);

        String result2 = String.valueOf(arrayService.countOccurrences(new int[]{2, 3, 3, 3, 4, 5}, 3));
        System.out.println(result2);

        arrayService.revert(new int[] {1, 2, 3, 4, 5});
        arrayService.sort(new int[] {2, 5, 3, 1, 4});

    }
}

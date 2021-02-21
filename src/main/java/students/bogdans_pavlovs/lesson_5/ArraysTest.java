package students.bogdans_pavlovs.lesson_5;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {

        int[] expectedArray = new int[10];
        Arrays createTestArray = new Arrays();

        int[] testArray = createTestArray.create(10);
        checkLength(testArray, expectedArray);

        }

        public void checkLength(int[] testArray, int[] expectedArray) {

            if(testArray.length == expectedArray.length){

                System.out.println("Array test = OK");
            } else {
                System.out.println("Array test = FAIL");
            }


        }

}

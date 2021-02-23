package students.bogdans_pavlovs.lesson_5.level_6;

class ArraysTest {

    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {

        int[] expectedArray = new int[10];
        Arrays createTestArray = new Arrays();

        int[] testArray = createTestArray.create(10);
        checkLength(testArray, expectedArray);

    }

    public void shouldFindMaxNumber() {

        Arrays createTestArray = new Arrays();
        int[] testArray = {-50, 100, -250, 999};

        int expectedMax = 999;

        int realMax = createTestArray.findMax(testArray);
        checkMax(realMax, expectedMax);

    }

    public void shouldFindMinNumber() {

        Arrays createTestArray = new Arrays();
        int[] testArray = {-300, 100, -550, 180};

        int expectedMin = -550;

        int realMin = createTestArray.findMin(testArray);
        checkMin(realMin, expectedMin);
    }



    public void checkLength(int[] testArray, int[] expectedArray) {

        if(testArray.length == expectedArray.length){

            System.out.println("Array test = OK");
        } else {
            System.out.println("Array test = FAIL");
        }


    }

    public void checkMax(int realMax, int expectedMax){

        if(realMax == expectedMax){
            System.out.println("Max test = OK");
        } else {
            System.out.println("Max test = FAIL");
        }

    }

    public void checkMin(int realMin, int expectedMin){

        if(realMin == expectedMin){
            System.out.println("Min test = OK");
        } else {
            System.out.println("Min test = FAIL");
        }

    }


}


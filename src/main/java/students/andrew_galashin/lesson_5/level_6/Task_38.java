package students.andrew_galashin.lesson_5.level_6;

class Task_38 {
    static class ArraysTest {

        public int[] create(int length) {
            return new int[length];
        }


        public static void main(String[] args) {
            ArraysTest test = new ArraysTest();
            test.shouldFindMaxNumber1();
            test.shouldFindMinNumber1();
            test.shouldCreateArray1();
        }

        public void shouldFindMinNumber1() {
            int expected = 5;
            int[] array = {5, 7, 9, 10};
            Arrays arrays = new Arrays();
            int result = arrays.findMin(array);
            if (expected == result) {
                System.out.println("2.Complete");
            } else {
                System.out.println("2.Fail");
            }
       }

        public void shouldFindMaxNumber1() {
            int expected = 10;
            int[] array = {5, 7, 9, 10};
            Arrays arrays = new Arrays();
            int result = arrays.findMax(array);
            if (expected == result) {
                System.out.println("1.Complete");
            } else {
                System.out.println("1.Fail");
            }
        }

        public void shouldCreateArray1() {
            int expected = 4;
            Arrays arrays = new Arrays();
            int[] array = arrays.create(4);
            int result = array.length;
            if (expected == result) {
                System.out.println("3.Complete");
            } else {
                System.out.println("3.Fail");
            }
        }
    }
}
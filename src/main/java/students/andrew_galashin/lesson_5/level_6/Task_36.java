package students.andrew_galashin.lesson_5.level_6;

class Task_36 {
    static class ArraysTest {

        public static void main(String[] args) {
            ArraysTest test = new ArraysTest();
            test.shouldCreateArray();
            test.shouldFindMaxNumber();
        }

        public void shouldCreateArray() {
            int expected = 4;
            Arrays arrays = new Arrays();
            int[] array = arrays.create(4);
            int reasult = array.length;
            if(expected == reasult){
                System.out.println("1.Complete");
            }
            else {
                System.out.println("1.Fail");
            }
        }

        public void shouldFindMaxNumber() {
            int expected = 10;
            int[] array = {5,7,9,10};
            Arrays arrays = new Arrays();
            int reasult = arrays.findMax(array);
            if(expected == reasult){
                System.out.println("2.Complete");
            }
            else {
                System.out.println("2.Fail");
            }

        }
    }
}

class Arrays {


    public int[] create(int length) {
        return new int[length];
    }
    public int findMax(int[] array) {

        int max = array[0];
        for (int a : array){
            if(a > max){
                max = a;
            }
        }
        return max;
    }

// не могу понять почему в 38 задании findMin игнорирует переменную из 37, и переводит меня в 36. Поэтому тут хотя бы написал, но как моенять навигаю не понимаю.
    public int findMin(int[] array) {
        int min = array[0];
        for (int x : array){
            if (x < min){
                min = x;
            }
        }
        return min;
    }
}


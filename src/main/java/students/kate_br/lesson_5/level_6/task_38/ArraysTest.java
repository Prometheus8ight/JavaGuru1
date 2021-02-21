package students.kate_br.lesson_5.level_6.task_38;

 class ArraysTest {

     public static void main(String[] args) {
         ArraysTest test = new ArraysTest();
         test.shouldCreateArray();
         test.shouldFindMaxNumber();
         test.shouldFindMinNumber();
     }

     public void shouldCreateArray(){
         int expectedResult = 10;
         Arrays arrays = new Arrays();
         int[] array = arrays.create(10);
         int realResult = array.length;

         if (expectedResult == realResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }

     }

     public void shouldFindMaxNumber(){
         int expectedResult = 15;
         Arrays arrays = new Arrays();
         int[] array = {7, 10, 15};
         int realResult = arrays.findMax(array);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void shouldFindMinNumber(){
         int expectedResult = 5;
         Arrays arrays = new Arrays();
         int[] array = {5, 10, 15};
         int realResult = arrays.findMin(array);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }
}

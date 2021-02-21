package students.kate_br.lesson_5.level_6.task_36;

 class ArraysTest {

     public static void main(String[] args) {

         ArraysTest test = new ArraysTest();
         test.shouldCreateArray();
         test.shouldFindMaxNumber();
     }


     public void shouldCreateArray(){

         int expectedResult = 10;
         Arrays arrays = new Arrays();
         int[] num = arrays.create(10);
         int realResult = num.length;

         if (expectedResult == realResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }

     public void shouldFindMaxNumber(){

         int expectedResult = 15;
         int[] array = { 5, 7, 15,};
         Arrays arrays = new Arrays();
         int realResult = arrays.findMax(array);

         if (expectedResult == realResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }


     }


}

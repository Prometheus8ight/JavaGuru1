package students.kate_br.lesson_5.level_5.task_32;

 class ArraysTest {

     public static void main(String[] args) {
         ArraysTest test = new ArraysTest();
         test.shouldCreateArray();

     }

     public void shouldCreateArray(){
         int expectedResult = 10;
         Arrays arrays = new Arrays();
         int[] num = arrays.create(10);
         int realResult = num.length;

         if(expectedResult == realResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }

     }
}

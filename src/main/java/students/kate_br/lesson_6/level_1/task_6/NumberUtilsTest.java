package students.kate_br.lesson_6.level_1.task_6;

 class NumberUtilsTest {

     public static void main(String[] args) {

         NumberUtilsTest test = new NumberUtilsTest();
         test.oddNumber(15);
         test.evenNumber(10);


     }

     public void oddNumber(int number){

         number = 15;
         boolean expectedResult = false;
         NumberUtils numberUtils = new NumberUtils();
         boolean realResult = numberUtils.isEven(15);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }

     }

     public void evenNumber(int number){

         number = 10;
         boolean expectedResult = true;
         NumberUtils numberUtils = new NumberUtils();
         boolean realResult = numberUtils.isEven(10);

         if (realResult == expectedResult){
             System.out.println("Test OK");
         }else {
             System.out.println("Test FAIL");
         }
     }


}


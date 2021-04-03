package students.kate_br.lesson_10.level_3.task_8;

 class InMemoryDatabaseTest {

     public static void main(String[] args) {
         InMemoryDatabaseTest test = new InMemoryDatabaseTest();
         test.saveTest();
         test.findByTitleTest();
     }

     void saveTest(){
         InMemoryDatabase database = new InMemoryDatabase();
         Product product = new Product("Coffee");
         database.save(product);
         checkTestResult(product, database.getArr()[0], "Save test: ");
     }

     void findByTitleTest(){
         InMemoryDatabase database = new InMemoryDatabase();
         Product product = new Product("Milk");
         database.save(product);
         checkTestResult(product, database.findByTitle("Milk"), "Find by title test: ");
     }

     private void checkTestResult(Object expectedResult, Object realResult, String testName){
         if (realResult == expectedResult){
             System.out.println(testName + "[ OK]");
         }else {
             System.out.println(testName + "[FAIL]");
         }
     }
}

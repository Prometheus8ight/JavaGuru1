package students.vitaly_porsev.lesson_10.level_3.task_8;

public class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.checkSave();
        inMemoryDatabaseTest.checkFindByTitle();
    }

    void checkSave(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Tomato");
        inMemoryDatabase.save(product);
        checkTests(product, inMemoryDatabase.getProductArray()[0], "checkSaveTest");
    }

    void checkFindByTitle(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("BlueBerry");
        inMemoryDatabase.save(product);
        checkTests(product, inMemoryDatabase.findByTitle("BlueBerry"), "checkFindByTitle");
    }

    void checkTests(Object expectedResult, Object realResult, String testName){
        if(realResult == expectedResult){
            System.out.println(testName + " - OK");
        }else {
            System.out.println(testName + " - False");
        }
    }
}

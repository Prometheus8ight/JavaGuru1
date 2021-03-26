package students.vitaly_porsev.lesson_10.level_3.task_10;

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
        checkSave(product, inMemoryDatabase.getProductArray()[0], "checkSaveTest");
    }

    void checkFindByTitle(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("BlueBerry");
        inMemoryDatabase.save(product);
        checkFindByTitle("Optional[Product{title = 'BlueBerry'}]", inMemoryDatabase.findByTitle("BlueBerry").toString(), "checkFindByTitle");
    }

    void checkSave(Object expectedResult, Object realResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " - OK");
        }else {
            System.out.println(testName + " - False");
        }
    }

    void checkFindByTitle(String expectedResult, String realResult, String testName){
        if(realResult.equals(expectedResult)){
            System.out.println(testName + " - OK");
        }else {
            System.out.println(testName + " - False");
        }
    }
}

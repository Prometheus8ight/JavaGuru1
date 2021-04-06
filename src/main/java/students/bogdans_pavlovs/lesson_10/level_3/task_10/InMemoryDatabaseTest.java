package students.bogdans_pavlovs.lesson_10.level_3.task_10;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.findByTitleTest();

    }

    void findByTitleTest(){

        InMemoryDatabase database = new InMemoryDatabase();

        Product a = new Product("Apple");
        database.save(a);

        checkResult(database.findByTitle("Apple").toString(), "Optional[Product{title='Apple'}]", "TEST");

    }

    void checkResult (String realResult, String expectedResult, String testName){

        if (realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}

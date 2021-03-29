package students.rodion_afanasjev.lesson_10.level_3.task_10;

class DatabaseTest {

    public static void main(String[] args) {

        DatabaseTest dataTest = new DatabaseTest();
        dataTest.saveTest();
        dataTest.findByTitleTest();

    }

    public void saveTest(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Vojna i mir");
        inMemoryDatabase.save(product);
        Object realResult = inMemoryDatabase.getProductArr()[0];
        check(realResult, product,"saveTest");
    }

    public void findByTitleTest(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Revizor");
        inMemoryDatabase.save(product);
        String realResult = inMemoryDatabase.findByTitle("Revizor").toString();
        checkFind(realResult,"Optional[Product{title='Revizor'}]","findByTitleTest");
    }

    public void check(Object realResult, Object expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

    public void checkFind(String realResult, String expectedResult, String testName){
        if (realResult.equals(expectedResult)){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}

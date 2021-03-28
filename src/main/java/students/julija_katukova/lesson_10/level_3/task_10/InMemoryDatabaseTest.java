package students.julija_katukova.lesson_10.level_3.task_10;

import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.findByTitleTest1();
        inMemoryDatabaseTest.findByTitleTest2();
        inMemoryDatabaseTest.findByTitleTest3();
        inMemoryDatabaseTest.findByTitleTest4();
    }

    private void findByTitleTest1() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product product3 = new Product("Orange");
        inMemoryDatabase.save(product3);
        String realResult = Optional.of(inMemoryDatabase.findByTitle("Watermelon").get()).toString();
        checkForProduct(realResult, "Optional[\"Watermelon\"]", "Find By Title Test1");
    }

    private void findByTitleTest2() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product product3 = new Product("Orange");
        inMemoryDatabase.save(product3);
        String realResult = Optional.of(inMemoryDatabase.findByTitle("Orange").get()).toString();
        checkForProduct(realResult, "Optional[\"Orange\"]", "Find By Title Test2");
    }

    private void findByTitleTest3() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product product3 = new Product("Orange");
        inMemoryDatabase.save(product3);
        String realResult = Optional.of(inMemoryDatabase.findByTitle("Apple").isPresent()).toString();
        checkForProduct(realResult, "Optional[true]", "Find By Title Test3");
    }

    private void findByTitleTest4() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product product3 = new Product("Orange");
        inMemoryDatabase.save(product3);
        String realResult = Optional.of(inMemoryDatabase.findByTitle("Cherry").isPresent()).toString();
        checkForProduct(realResult, "Optional[false]", "Find By Title Test4");
    }


    public void checkForProduct(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}


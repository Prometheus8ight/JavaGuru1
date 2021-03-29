package students.deniss_jankovskis.lesson_10.level_3.task_10;

import java.util.Optional;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.findByTitleTest1();
        test.findByTitleTest2();
    }

    private void findByTitleTest1() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        inMemoryDatabase.save(milk);
        Product cheese = new Product("Cheese");
        inMemoryDatabase.save(cheese);
        Product lemon = new Product("Lemon");
        inMemoryDatabase.save(lemon);
        String realResult = Optional.of(inMemoryDatabase.findByTitle("Lemon").get()).toString();
        checkTestResult(realResult, "Optional[Lemon]", "Find By Title Test 1");
    }

    private void findByTitleTest2() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        inMemoryDatabase.save(milk);
        Product cheese = new Product("Cheese");
        inMemoryDatabase.save(cheese);
        Product lemon = new Product("Lemon");
        inMemoryDatabase.save(lemon);
        String realResult = Optional.of(inMemoryDatabase.findByTitle("Cheese").get()).toString();
        checkTestResult(realResult, "Optional[Milk]", "Find By Title Test 2");
    }

    public void checkTestResult(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}

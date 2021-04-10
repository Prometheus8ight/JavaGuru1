package students.andrew_galashin.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest start = new InMemoryDatabaseTest();
        ;
        start.testOne();
        start.testTwo();
        start.testThree();
        start.testFind();
    }

    void testOne() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("One");
        inMemoryDatabase.save(product);
        Product[] result = inMemoryDatabase.getProducts();
        check(result, new Product[]{product}, "testOne");
    }

    void testTwo() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("One");
        inMemoryDatabase.save(product);
        Product product1 = new Product("Two");
        inMemoryDatabase.save(product1);
        Product[] result = inMemoryDatabase.getProducts();
        check(result, new Product[]{product, product1}, "testTwo");
    }

    void testThree() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("One");
        inMemoryDatabase.save(product);
        Product product1 = new Product("Two");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Three");
        inMemoryDatabase.save(product2);
        Product[] result = inMemoryDatabase.getProducts();
        check(result, new Product[]{product, product1, product2}, "testThree");
    }

    void testFind() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("One");
        inMemoryDatabase.save(product);
        Product product1 = new Product("Two");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Three");
        inMemoryDatabase.save(product2);
        Product result = inMemoryDatabase.findByTitle("Three");
        check2(result, product2, "testFind");
    }

    void check(Product[] result, Product[] expected, String testName) {
        if (Arrays.equals(result, expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }

    void check2(Product result, Product expected, String testName) {
        if (result.equals(expected)) {
            System.out.println(testName + ": Complete");
        } else {
            System.out.println(testName + ": Fail");
        }
    }
}

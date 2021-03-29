package students.julija_katukova.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryDatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();
        inMemoryDatabaseTest.addFirstProductTest();
        inMemoryDatabaseTest.addSecondProductTest();
        inMemoryDatabaseTest.addThirdProductTest();
        inMemoryDatabaseTest.findByTitleTest();
    }

    private void addFirstProductTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product[] realResult = inMemoryDatabase.getProducts();
        checkForArrays(realResult, new Product[]{product1}, "Add First Product Test");
    }

    private void addSecondProductTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product[] realResult = inMemoryDatabase.getProducts();
        checkForArrays(realResult, new Product[]{product1, product2}, "Add Second Product Test");
    }

    private void addThirdProductTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product product3 = new Product("Orange");
        inMemoryDatabase.save(product3);
        Product[] realResult = inMemoryDatabase.getProducts();
        checkForArrays(realResult, new Product[]{product1, product2, product3}, "Add Third Product Test");
    }

    private void findByTitleTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Apple");
        inMemoryDatabase.save(product1);
        Product product2 = new Product("Watermelon");
        inMemoryDatabase.save(product2);
        Product product3 = new Product("Orange");
        inMemoryDatabase.save(product3);
        Product realResult = inMemoryDatabase.findByTitle("Watermelon");
        checkForProduct(realResult, product2, "Find By Title Test");
    }

    public void checkForArrays(Product[] realResult, Product[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void checkForProduct(Product realResult, Product expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

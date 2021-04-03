package students.deniss_jankovskis.lesson_10.level_3.task_8;

import java.util.Arrays;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.firstProductTest();
        test.secondProductTest();
        test.findByTitleTest();
    }

    public void firstProductTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        inMemoryDatabase.save(milk);
        Product[] realResult = inMemoryDatabase.getProducts();
        checkArraysResult(realResult, new Product[]{milk}, "First Product Test");
    }

    public void secondProductTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product cheese = new Product("Cheese");
        inMemoryDatabase.save(cheese);
        Product[] realResult = inMemoryDatabase.getProducts();
        checkArraysResult(realResult, new Product[]{cheese}, "Second Product Test");
    }

    private void findByTitleTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        inMemoryDatabase.save(milk);
        Product cheese = new Product("Cheese");
        inMemoryDatabase.save(cheese);
        Product realResult = inMemoryDatabase.findByTitle("Milk");
        checkProductResult(realResult, milk, "Find By Title Test");
    }

    public void checkArraysResult(Product[] realResult, Product[] expectedResult, String testName) {
        if (Arrays.equals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }

    public void checkProductResult(Product realResult, Product expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}







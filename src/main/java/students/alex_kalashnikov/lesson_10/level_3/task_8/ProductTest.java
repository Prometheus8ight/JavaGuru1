package students.alex_kalashnikov.lesson_10.level_3.task_8;

import java.util.Arrays;

class ProductTest {

    public static void main(String[] args) {

        ProductTest victim = new ProductTest();
        victim.testSaveProduct();
        victim.testSaveProduct1();
        victim.testFindProduct();

    }

    void test(Product[] expectedResult, Product[] realResult) {
        if (Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testFind(Product expectedResult, Product realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testNegative(Product[] expectedResult, Product[] realResult) {
        if (!Arrays.equals(expectedResult, realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testSaveProduct() {
        InMemoryDatabase testDatabase = new InMemoryDatabase();
        Product[] expectedResult = {new Product("Milk"), new Product("Bread"), new Product("Beer"),
                new Product("Cheese"), new Product("Meat")};
        testDatabase.save(new Product("Milk"));
        testDatabase.save(new Product("Bread"));
        testDatabase.save(new Product("Beer"));
        testDatabase.save(new Product("Cheese"));
        testDatabase.save(new Product("Meat"));
        test(expectedResult, testDatabase.getArr());
    }

    void testSaveProduct1() {
        InMemoryDatabase testDatabase = new InMemoryDatabase();
        Product[] expectedResult = {new Product("Milk"), new Product("Bread"), new Product("Beer"),
                new Product("Cheese"), new Product("Meat")};
        testDatabase.save(new Product("Milk"));
        testDatabase.save(new Product("Bread"));
        testDatabase.save(new Product("Cheese"));
        testDatabase.save(new Product("Meat"));
        testNegative(expectedResult, testDatabase.getArr());
    }

    void testFindProduct() {
        InMemoryDatabase testDatabase = new InMemoryDatabase();
        testDatabase.save(new Product("Milk"));
        testDatabase.save(new Product("Bread"));
        testDatabase.save(new Product("Beer"));
        testDatabase.save(new Product("Cheese"));
        testDatabase.save(new Product("Meat"));
        Product expectedResult = testDatabase.getArr()[2];
        Product realResult = testDatabase.findByTitle("Beer");
        testFind(expectedResult, realResult);
    }

}
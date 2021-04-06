package students.bogdans_pavlovs.lesson_10.level_3.Task_8;

import java.util.Arrays;

class InMemoryDatabaseTest {

    public static void main(String[] args) {

        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveTest();
        test.findByTitleTest();

    }


    void saveTest (){

        InMemoryDatabase database = new InMemoryDatabase();

        Product a = new Product("Apple");
        database.save(a);

        Product b = new Product("Kiwi");
        database.save(b);

        Product c = new Product("Pear");
        database.save(c);


        checkResultArray(database.getProducts(), new Product[]{a, b, c}, "Save Test" );

    }

    void findByTitleTest(){

        InMemoryDatabase database = new InMemoryDatabase();

        Product a = new Product("Apple");
        database.save(a);

        Product b = new Product("Kiwi");
        database.save(b);

        Product c = new Product("Pear");
        database.save(c);

        checkResultObject (database.findByTitle("Kiwi"), b, "Find by Title Test");

    }

    void checkResultArray (Product[] realResult, Product[] expectedResult, String testName){

        if (Arrays.equals(realResult, expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }

    void checkResultObject (Product realResult, Product expectedResult, String testName){

        if (realResult.equals(expectedResult)){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}

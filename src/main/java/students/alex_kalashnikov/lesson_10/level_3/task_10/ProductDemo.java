package students.alex_kalashnikov.lesson_10.level_3.task_10;

import java.util.Arrays;

class ProductDemo {

    public static void main(String[] args) {

        InMemoryDatabase newDatabase = new InMemoryDatabase();
        System.out.println("Product Array: " + Arrays.toString(newDatabase.getArr()));

        newDatabase.save(new Product("Milk"));
        System.out.println("Product Array: " + Arrays.toString(newDatabase.getArr()));

        newDatabase.save(new Product("Bread"));
        System.out.println("Product Array: " + Arrays.toString(newDatabase.getArr()));

        newDatabase.save(new Product("Beer"));
        System.out.println("Product Array: " + Arrays.toString(newDatabase.getArr()));

        newDatabase.save(new Product("Cheese"));
        System.out.println("Product Array: " + Arrays.toString(newDatabase.getArr()));

        System.out.println("Product found: " + newDatabase.findByTitle("Cheese"));

    }

}
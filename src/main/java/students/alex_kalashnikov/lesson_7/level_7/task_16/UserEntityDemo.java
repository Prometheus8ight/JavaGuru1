package students.alex_kalashnikov.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserEntityDemo {

    public static void main(String[] args) {

        UserRepository newObject = new UserRepository();
        newObject.save(new UserEntity( 1, "John", "Johnson"));
        newObject.save(new UserEntity( 2, "John", "Smith"));
        newObject.save(new UserEntity( 3, "Vasily", "Pupkin"));
        newObject.save(new UserEntity( 4, "Janis", "Berzins"));
        newObject.save(new UserEntity( 5, "Juan", "Pedro"));
        newObject.save(new UserEntity( 6, "Sandis", "Berzins"));
        System.out.println("Find user by ID number: " + newObject.findById(3));
        System.out.println("Find user by first name: " + Arrays.toString(newObject.findByFirstName("John")));
        System.out.println("Find user by surname: " + Arrays.toString(newObject.findBySurname("Berzins")));
        System.out.println("Show all users: " + Arrays.toString(newObject.findAll()));
        newObject.delete(2);
        System.out.println("Show all users: " + Arrays.toString(newObject.findAll()));
        newObject.edit(5, "Ivan", "Ivanov");
        System.out.println("Show all users: " + Arrays.toString(newObject.findAll()));

    }

}

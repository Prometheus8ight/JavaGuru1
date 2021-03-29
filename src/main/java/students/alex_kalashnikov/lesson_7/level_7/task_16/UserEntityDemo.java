package students.alex_kalashnikov.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserEntityDemo {

    public static void main(String[] args) {

        UserRepository newObject = new UserRepository();
        newObject.save(new UserEntity("John", "Johnson"));
        newObject.save(new UserEntity("John", "Smith"));
        newObject.save(new UserEntity("Vasily", "Pupkin"));
        newObject.save(new UserEntity("Janis", "Berzins"));
        newObject.save(new UserEntity("Juan", "Pedro"));
        newObject.save(new UserEntity("Sandis", "Berzins"));
        System.out.println("Show all users: " + Arrays.toString(newObject.findAll()));
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

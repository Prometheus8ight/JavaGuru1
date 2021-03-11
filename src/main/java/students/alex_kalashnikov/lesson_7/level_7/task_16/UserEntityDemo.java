package students.alex_kalashnikov.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserEntityDemo {

    public static void main(String[] args) {

        UserEntity newObject = new UserEntity();

        String[][] userArr = newObject.createArray(10, 3);

        newObject.addUser(userArr, "Vasily", "Pupkin", "1234");
        newObject.addUser(userArr, "Janis", "Berzins", "5678");
        newObject.addUser(userArr, "Janis", "Ozolins", "8765");
        newObject.addUser(userArr, "John", "Smith", "0101");
        newObject.addUser(userArr, "Juan", "Pedro", "0123");
        newObject.addUser(userArr, "John", "Pupkin", "0987");
        newObject.addUser(userArr, "Kim", "Chen In", "5376");

        String[][] searchByIdNumber = newObject.findUserById(userArr, "0101"); // поиск по ID номеру
        System.out.println(Arrays.deepToString(searchByIdNumber));

        String[][] searchByFirstName = newObject.findUserByFirstName(userArr, "John"); // поиск по имени
        System.out.println(Arrays.deepToString(searchByFirstName));

        String[][] searchBySurname = newObject.findUserBySurname(userArr, "Pupkin"); // поиск по фамилии
        System.out.println(Arrays.deepToString(searchBySurname));

        System.out.println(Arrays.deepToString(newObject.findAllUsers(userArr))); // все пользователи

        newObject.editUser(userArr, "5376", "Ivan", "Ivanov", "1111"); // изменение данных пользователя

        System.out.println(Arrays.deepToString(newObject.findAllUsers(userArr)));

        newObject.deleteUser(userArr, "5678"); // удаление пользователя

        System.out.println(Arrays.deepToString(newObject.findAllUsers(userArr)));
        System.out.println(Arrays.deepToString(userArr));

    }

}


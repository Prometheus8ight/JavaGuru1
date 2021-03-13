package students.alex_kalashnikov.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserRepositoryTest {

    public static void main(String[] args) {

        UserRepositoryTest newObject = new UserRepositoryTest();
        newObject.testAddUser();
        newObject.testFindUserById();
        newObject.testFindUsersByFirstName();
        newObject.testFindUsersBySurname();
        newObject.testFindAllUsers();
        newObject.testEditUser();
        newObject.testDeleteUser();
        newObject.testMultipleTasks();
        newObject.testAddInfiniteUsers();

    }

    public String[][] createArr() {
        UserRepository newObject = new UserRepository();
        String[][] arr = newObject.createArray(10, 3);
        newObject.addUser(arr, "Vasily", "Pupkin", "1234");
        newObject.addUser(arr, "Janis", "Berzins", "5678");
        newObject.addUser(arr, "Janis", "Ozolins", "8765");
        newObject.addUser(arr, "John", "Smith", "0101");
        newObject.addUser(arr, "Juan", "Pedro", "0123");
        newObject.addUser(arr, "John", "Pupkin", "0987");
        newObject.addUser(arr, "Kim", "Chen In", "5376");
        return arr;
    }

    public void check(String[][] expectedArr, String[][] realArr) {
        if (Arrays.deepEquals(realArr, expectedArr)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    public void testAddUser() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"Janis", "Berzins", "5678"},
                {"Janis", "Ozolins", "8765"}, {"John", "Smith", "0101"}, {"Juan", "Pedro", "0123"},
                {"John", "Pupkin", "0987"}, {"Kim", "Chen In", "5376"}, {"Hans", "Valter", "8642"},
                {"empty", "empty", "empty"}, {"empty", "empty", "empty"}};
        newObject.addUser(arr, "Hans", "Valter", "8642");
        check(expectedArr, arr);
    }

    public void testFindUserById() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"John", "Smith", "0101"}};
        String[][] realArr = newObject.findUserById(arr, "0101");
        check(expectedArr, realArr);
    }

    public void testFindUsersByFirstName() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"John", "Smith", "0101"}, {"John", "Pupkin", "0987"}};
        String[][] realArr = newObject.findUserByFirstName(arr, "John");
        check(expectedArr, realArr);
    }

    public void testFindUsersBySurname() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"John", "Pupkin", "0987"}};
        String[][] realArr = newObject.findUserBySurname(arr, "Pupkin");
        check(expectedArr, realArr);
    }

    public void testFindAllUsers() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"Janis", "Berzins", "5678"},
                {"Janis", "Ozolins", "8765"}, {"John", "Smith", "0101"}, {"Juan", "Pedro", "0123"},
                {"John", "Pupkin", "0987"}, {"Kim", "Chen In", "5376"}};
        String[][] realArr = newObject.findAllUsers(arr);
        check(expectedArr, realArr);
    }

    public void testEditUser() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"Janis", "Berzins", "5678"},
                {"Janis", "Ozolins", "8765"}, {"Ivan", "Ivanov", "1111"}, {"Juan", "Pedro", "0123"},
                {"John", "Pupkin", "0987"}, {"Kim", "Chen In", "5376"}};
        newObject.editUser(arr, "0101", "Ivan", "Ivanov", "1111");
        String[][] realArr = newObject.findAllUsers(arr);
        check(expectedArr, realArr);
    }

    public void testDeleteUser() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"Janis", "Berzins", "5678"}, {"John", "Smith", "0101"}, {"Juan", "Pedro", "0123"},
                {"John", "Pupkin", "0987"}, {"Kim", "Chen In", "5376"}};
        newObject.deleteUser(arr, "8765");
        String[][] realArr = newObject.findAllUsers(arr);
        check(expectedArr, realArr);
    }

    public void testMultipleTasks() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"Janis", "Berzins", "5678"},
                {"John", "Smith", "0101"}, {"Juan", "Sanchez", "0123"},
                {"John", "Pupkin", "0987"}, {"Kim", "Chen In", "5376"}, {"Hans", "Valter", "8642"},
                {"Mario", "Borelli", "3697"}, {"empty", "empty", "empty"}, {"empty", "empty", "empty"}};
        newObject.addUser(arr, "Hans", "Valter", "8642");
        newObject.deleteUser(arr, "8765");
        newObject.editUser(arr, "0123", "Juan", "Sanchez", "0123");
        newObject.addUser(arr, "Mario", "Borelli", "3697");
        check(expectedArr, arr);
    }

    public void testAddInfiniteUsers() {
        UserRepository newObject = new UserRepository();
        String[][] arr = createArr();
        String[][] expectedArr = {{"Vasily", "Pupkin", "1234"}, {"Janis", "Berzins", "5678"},
                {"Janis", "Ozolins", "8765"}, {"John", "Smith", "0101"}, {"Juan", "Pedro", "0123"},
                {"John", "Pupkin", "0987"}, {"Kim", "Chen In", "5376"}, {"Hans", "Valter", "8642"},
                {"Mario", "Borelli", "3697"}, {"James", "Bond", "0007"}};
        newObject.addUser(arr, "Hans", "Valter", "8642");
        newObject.addUser(arr, "Mario", "Borelli", "3697");
        newObject.addUser(arr, "James", "Bond", "0007");
        newObject.addUser(arr, "Donald", "Trump", "3333");
        check(expectedArr, arr);

    }
}
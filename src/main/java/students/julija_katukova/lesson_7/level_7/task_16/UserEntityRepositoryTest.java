package students.julija_katukova.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserEntityRepositoryTest {
    public static void main(String[] args) {
        UserEntityRepositoryTest userEntityRepositoryTest = new UserEntityRepositoryTest();
        userEntityRepositoryTest.test1();
        userEntityRepositoryTest.test2();
        userEntityRepositoryTest.test3();
        userEntityRepositoryTest.test4();
        userEntityRepositoryTest.test5();
        userEntityRepositoryTest.test6();
        userEntityRepositoryTest.test7();
        userEntityRepositoryTest.test8();
    }

    public void test1() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("TS-123", "Tom", "Smith", "010386-13341");
        userEntityRepository.addNewUser(user1);
        String[][] realResult = userEntityRepository.getUsers();
        checkForTwoDimensionalArrays(realResult, new String[][]{{"TS-123", "Tom", "Smith", "010386-13341"}}, "Add First User Test");
    }

    public void test2() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("TS-123", "Tom", "Smith", "010386-13341");
        UserEntity user2 = new UserEntity("JS-113", "Jane", "Smith", "150789-17341");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        String[][] realResult = userEntityRepository.getUsers();
        checkForTwoDimensionalArrays(realResult, new String[][]{{"TS-123", "Tom", "Smith", "010386-13341"}, {"JS-113", "Jane", "Smith", "150789-17341"}}, "Add First and Second User Test");
    }

    public void test3() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("TS-123", "Tom", "Smith", "010386-13341");
        UserEntity user2 = new UserEntity("JS-113", "Jane", "Smith", "150789-17341");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        String realResult = userEntityRepository.findUserById("JS-113");
        checkForStrings(realResult, "[JS-113, Jane, Smith, 150789-17341]", "Search By ID Test1");
    }

    public void test4() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("TS-123", "Tom", "Smith", "010386-13341");
        UserEntity user2 = new UserEntity("JS-113", "Jane", "Smith", "150789-17341");
        UserEntity user3 = new UserEntity("JK-183", "John", "Kot", "151199-18341");
        UserEntity user4 = new UserEntity("AB-103", "Anna", "Born", "010698-17346");
        UserEntity user5 = new UserEntity("KM-103", "Kot", "Malika", "010118-11111");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        userEntityRepository.addNewUser(user3);
        userEntityRepository.addNewUser(user4);
        userEntityRepository.addNewUser(user5);
        String realResult = userEntityRepository.findUserById("JK-183");
        checkForStrings(realResult, "[JK-183, John, Kot, 151199-18341]", "Search By ID Test2");
    }

    public void test5() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("MC-781", "Max", "Call", "020374-12745");
        UserEntity user2 = new UserEntity("JK-53", "Jo", "Kennedy", "150789-17548");
        UserEntity user3 = new UserEntity("VK-672", "Vikky", "Kro", "040798-14568");
        UserEntity user4 = new UserEntity("MB-42", "Max", "Bars", "030489-32185");
        UserEntity user5 = new UserEntity("KM-103", "Kiko", "Must", "120493-45671");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        userEntityRepository.addNewUser(user3);
        userEntityRepository.addNewUser(user4);
        userEntityRepository.addNewUser(user5);
        String realResult = userEntityRepository.findUserByName("Max");
        checkForStrings(realResult, "[MC-781, Max, Call, 020374-12745][MB-42, Max, Bars, 030489-32185]", "Search Name Test");
    }

    public void test6() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("JS-113", "Jane", "Smith", "150789-17341");
        UserEntity user2 = new UserEntity("AB-103", "Anna", "Born", "010698-17346");
        UserEntity user3 = new UserEntity("VK-672", "Vikky", "Kro", "040798-14568");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        userEntityRepository.addNewUser(user3);
        String realResult = userEntityRepository.getAllUsersInfo();
        checkForStrings(realResult, "[[JS-113, Jane, Smith, 150789-17341], [AB-103, Anna, Born, 010698-17346], [VK-672, Vikky, Kro, 040798-14568]]", "Get All Users Info Test");
    }

    public void test7() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("TS-123", "Tom", "Smith", "010386-13341");
        UserEntity user2 = new UserEntity("JS-113", "Jane", "Smith", "150789-17341");
        UserEntity user3 = new UserEntity("VK-672", "Vikky", "Kro", "040798-14568");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        userEntityRepository.addNewUser(user3);
        userEntityRepository.updateUserInfo("150789-17341", "Smith", "Kennedy");
        String[][] realResult = userEntityRepository.getUsers();
        checkForTwoDimensionalArrays(realResult, new String[][]{{"TS-123", "Tom", "Smith", "010386-13341"}, {"JS-113", "Jane", "Kennedy", "150789-17341"}, {"VK-672", "Vikky", "Kro", "040798-14568"}}, "Info Update Test");
    }

    public void test8() {
        UserEntityRepository userEntityRepository = new UserEntityRepository();
        UserEntity user1 = new UserEntity("TS-123", "Tom", "Smith", "010386-13341");
        UserEntity user2 = new UserEntity("MB-42", "Max", "Bars", "030489-32185");
        UserEntity user3 = new UserEntity("VK-672", "Vikky", "Kro", "040798-14568");
        userEntityRepository.addNewUser(user1);
        userEntityRepository.addNewUser(user2);
        userEntityRepository.addNewUser(user3);
        userEntityRepository.deleteUser("030489-32185");
        String[][] realResult = userEntityRepository.getUsers();
        checkForTwoDimensionalArrays(realResult, new String[][]{{"TS-123", "Tom", "Smith", "010386-13341"}, {"VK-672", "Vikky", "Kro", "040798-14568"}}, "Delete User Test");
    }


    public void checkForTwoDimensionalArrays(String[][] realResult, String[][] expectedResult, String testName) {
        if (Arrays.deepEquals(realResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void checkForStrings(String realResult, String expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
package main.java.students.julija_katukova.lesson_8.level_7.task_31;

import java.util.Arrays;

class UserRepository {

    User[] libraryUsers = new User[3];

    User[] findAllLibraryUsers() {
        return libraryUsers;
    }


    public static void main(String[] args) {
        User user1 = new User("AK-895", "Anna", "Klein", "annak23@gmail.com");
        User user2 = new User("TR-25596", "Tom", "Raoul", "tommyra45@gmail.com");
        User user3 = new User("JP-7832", "Jo", "Pitt", "jojopi@gmail.com");

        UserRepository libraryUsersRepository = new UserRepository();
        libraryUsersRepository.addNewUser(user1);
        libraryUsersRepository.addNewUser(user2);
        libraryUsersRepository.addNewUser(user3);

        System.out.println(Arrays.toString(libraryUsersRepository.findAllLibraryUsers()));

    }

    void addNewUser(User newUser) {
        for (int i = 0; i < libraryUsers.length; i++) {
            if (libraryUsers[i] == null) {
                libraryUsers[i] = newUser;
                break;
            }
        }
    }

}

package main.java.students.julija_katukova.lesson_8.level_7.task_31;

class UserRepository {

    User[] libraryUsers = new User[3];

    void addNewUser(User newUser) {
        for (int i = 0; i < libraryUsers.length; i++) {
            if (libraryUsers[i] == null) {
                libraryUsers[i] = newUser;
                break;
            }
        }
    }
}

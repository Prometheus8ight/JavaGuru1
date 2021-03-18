package instructor.lesson_9.repository;

import java.util.UUID;

class UserRepository {

    private final User[] users = new User[100];

    User[] findAll() {
        return users;
    }

    User findById(UUID id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    void save(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            }
        }
    }

    void delete(UUID id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId().equals(id)) {
                users[i] = null;
            }
        }
    }
}


// CRUD
// C - CREATE
// R - READ
// U - UPDATE
// D - DELETE

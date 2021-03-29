package students.deniss_jankovskis.lesson_7.task_16;

import java.util.UUID;

class Repository {

    private UserEntity[] userEntities = new UserEntity[10];


    public void saveUser(UserEntity userEntity) {
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i] == null) {
                userEntities[i] = userEntity;
                break;
            }
        }
    }

    public void deleteUser(String name) {
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i] != null && userEntities[i].getName().equals(name)) {
                userEntities[i] = null;
            }
        }
    }

    public void editUser(String id, String name, String surname) {
        int index = 0;
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i] == null) {
                continue;
            }
            if (userEntities[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        userEntities[index].setName(name);
        userEntities[index].setSurname(surname);
    }


    UserEntity[] findAllUsers() {
        return userEntities;
    }

    public UserEntity findById(UUID id) {
        for (UserEntity userEntity : userEntities) {
            if (userEntity.getId().equals(id)) {
                return userEntity;
            }

        }
        return null;
    }

    public UserEntity findByName(String name) {
        for (UserEntity userEntity : userEntities) {
            if (userEntity.getName().equals(name)) {
                return userEntity;
            }

        }
        return null;

    }

    public UserEntity findBySurname(String surname) {
        for (UserEntity userEntity : userEntities) {
            if (userEntity.getSurname().equals(surname)) {
                return userEntity;
            }

        }
        return null;
    }

    public UserEntity findByPersonalCode(String personalCode) {
        for (UserEntity userEntity : userEntities) {
            if (userEntity.getPersonalCode().equals(personalCode)) {
                return userEntity;
            }

        }
        return null;
    }

}

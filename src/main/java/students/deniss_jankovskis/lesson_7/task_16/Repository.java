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

    public void deleteUser(UUID id) {
        for (int i = 0; i < userEntities.length; i++) {
            if (userEntities[i] != null && userEntities[i].getId().equals(id)) {
                userEntities[i] = null;
            }
        }
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

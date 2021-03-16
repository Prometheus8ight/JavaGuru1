package students.alex_kalashnikov.lesson_7.level_7.task_16;

class UserRepository {

    private int length = 10;
    private UserEntity[] array = new UserEntity[length];

    void save(UserEntity entity) {
        if (entity.getIdNumber() - 1 < length) {
            array[entity.getIdNumber() - 1] = entity;
        } else {
            System.out.println("Not enough space in repository!");
        }
    }

    UserEntity findById(int idNumber) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getIdNumber() == idNumber) {
                index = i;
                break;
            }
        }
        if (index > -1) {
            return array[index];
        } else {
            return null;
        }
    }

    UserEntity[] findByFirstName(String firstName) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getFirstName().equals(firstName)) {
                count++;
            }
        }
        UserEntity[] firstNameArr = new UserEntity[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getFirstName().equals(firstName)) {
                firstNameArr[j] = array[i];
                j++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            return firstNameArr;
        }
    }

    UserEntity[] findBySurname(String surname) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getSurname().equals(surname)) {
                count++;
            }
        }
        UserEntity[] surnameArr = new UserEntity[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getSurname().equals(surname)) {
                surnameArr[j] = array[i];
                j++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            return surnameArr;
        }
    }

    void delete(int idNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getIdNumber() == idNumber) {
                array[i] = null;
            }
        }
    }

    UserEntity[] findAll() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                count++;
            }
        }
        UserEntity[] allArr = new UserEntity[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            } else {
                allArr[j] = array[i];
                j++;
            }
        }
        return allArr;
    }

    void edit(int idNumber, String firstName, String surname) { // позволяет менять имя и/или фамилию
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                continue;
            }
            if (array[i].getIdNumber() == idNumber) {
                index = i;
                break;
            }
        }
        array[index].setFirstName(firstName);
        array[index].setSurname(surname);
    }

}
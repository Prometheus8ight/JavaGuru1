package students.julija_katukova.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserEntityRepository {
    UserEntity userEntity = new UserEntity("", "", "", "");
    String[][] users = new String[1][userEntity.getNumberOfColumns()];
    /*
      id      name    surname     personal code (fixed number of columns)
    TS-123    john    smith       010596-12841
     */

    public void addNewUser(String[][] users, String id, String name, String surname, String personalCode) {
        if (isItFirstUser()) {
            addFirstUser(users, id, name, surname, personalCode);
        } else {
            addOneMoreUser(users, id, name, surname, personalCode);
        }
    }

    private boolean isItFirstUser() {
        return this.users[0][0] == null;
    }

    private void addFirstUser(String[][] users, String id, String name, String surname, String personalCode) { //we defined array with first empty row.
        addNewUserInfoInLastArrayRow(users, id, name, surname, personalCode);                                  //First user will take this row. No need to extend the array users
    }

    private void addOneMoreUser(String[][] users, String id, String name, String surname, String personalCode) {
        this.users = extendArray(users);
        addNewUserInfoInLastArrayRow(this.users, id, name, surname, personalCode);
    }

    private String[][] extendArray(String[][] users) {
        String[][] out = new String[users.length + 1][userEntity.getNumberOfColumns()]; // adding new user will increase #rows by one in existing array
        for (int i = 0; i < (users.length); i++) { //make array copy with all data
            out[i] = users[i];
        }
        return out;  // return new array with all data + one row wil default values
    }

    private void addNewUserInfoInLastArrayRow(String[][] users, String id, String name, String surname, String personalCode) {
        int column = 0;
        users[(users.length - 1)][column++] = id;
        users[(users.length - 1)][column++] = name;
        users[(users.length - 1)][column++] = surname;
        users[(users.length - 1)][column++] = personalCode;
    }

    public String findUserById(String[][] users, String id) {
        return convertStringArrayToString(findRowWithGivenId(users, id));
    }

    private String[] findRowWithGivenId(String[][] users, String id) {
        int i;
        for (i = 0; i < users.length; i++) { // перебор строк
            if (users[i][0].equals(id)) {
                return users[i];
            }
        }
        return users[i];
    }

    private String convertStringArrayToString(String[] row) {
        return Arrays.toString(row);
    }

    public String findUserByName(String[][] users, String name) {
        String out = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i][1].equals(name)) {
                if (out == null) {
                    out = Arrays.toString(users[i]);
                } else {
                    out = out + Arrays.toString(users[i]);
                }
            }
        }
        return out;
    }

    public String getAllUsersInfo(String[][] users) {
        return Arrays.deepToString(users);
    }

    public void updateUserInfo(String[][] users, String personalCode, String outdatedInfo, String newInfo) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][3].equals(personalCode)) { // identify user by personal code
                for (int j = 0; j < userEntity.getNumberOfColumns(); j++) {
                    if (users[i][j].equals(outdatedInfo)) {
                        users[i][j] = newInfo;
                    }
                }
            }
        }
    }

    public String[][] deleteUser(String[][] users, String personalCode) {
        this.users = deleteEmptyRowFromArray(deleteUserInfoFromArray(users, personalCode));
        return this.users;
    }

    private String[][] deleteUserInfoFromArray(String[][] users, String personalCode) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][3].equals(personalCode)) { // identify user by personal code
                for (int j = 0; j < userEntity.getNumberOfColumns(); j++) {
                    users[i][j] = null;
                }
            }
        }
        return users;
    }

    private String[][] deleteEmptyRowFromArray(String[][] users) {
        String[][] out = new String[users.length - 1][userEntity.getNumberOfColumns()]; //new array will have less rows
        for (int row = 0; row < (users.length - 1); row++) {
            for (int j = 0; j < userEntity.getNumberOfColumns(); j++) {
                if (row < emptyRowIndex(users)) {
                    out[row][j] = users[row][j];
                } else {
                    out[row][j] = users[(row + 1)][j];
                }
            }

        }
        return out;
    }

    private int emptyRowIndex(String[][] users) {
        int emptyRowIndex = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i][0] == null) {
                emptyRowIndex = i;
            }
        }
        return emptyRowIndex;
    }

}
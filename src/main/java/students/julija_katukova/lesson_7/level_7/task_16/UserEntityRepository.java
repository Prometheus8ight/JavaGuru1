package students.julija_katukova.lesson_7.level_7.task_16;

import java.util.Arrays;

class UserEntityRepository {
    private final int COLUMN_COUNT = 4;
    private String[][] users = new String[0][COLUMN_COUNT];


    /*
      id      name    surname     personal code (fixed number of columns)
    TS-123    john    smith       010596-12841
     */

    private final int COL_IDX_ID = 0;
    private final int COL_IDX_NAME = 1;
    private final int COL_IDX_SURNAME = 2;
    private final int COL_IDX_CODE = 3;


    public String[][] getUsers() {
        return users;
    }

    public void addNewUser(UserEntity user) {
        addUser(user);
    }


    private void addUser(UserEntity user) {
        this.users = extendArray();
        addNewUserInfoInLastArrayRow(user);
    }

    private String[][] extendArray() {
        String[][] out = new String[users.length + 1][COLUMN_COUNT]; // adding new user will increase #rows by one in existing array
        for (int i = 0; i < (users.length); i++) { //make array copy with all data
            out[i] = users[i];
        }
        return out;  // return new array with all data + one row wil default values
    }

    private void addNewUserInfoInLastArrayRow(UserEntity user) {
        users[(users.length - 1)][COL_IDX_ID] = user.getId();
        users[(users.length - 1)][COL_IDX_NAME] = user.getName();
        users[(users.length - 1)][COL_IDX_SURNAME] = user.getSurname();
        users[(users.length - 1)][COL_IDX_CODE] = user.getPersonalCode();
    }

    public String findUserById(String id) {
        return convertStringArrayToString(findRowWithGivenId(id));
    }

    private String[] findRowWithGivenId(String id) {
        for (String[] user : users) { // перебор строк
            if (user[COL_IDX_ID].equals(id)) {
                return user;
            }
        }
        return null;
    }

    private String convertStringArrayToString(String[] row) {
        return Arrays.toString(row);
    }

    public String findUserByName(String name) {
        String out = null;
        for (String[] user : users) {
            if (user[1].equals(name)) {
                if (out == null) {
                    out = Arrays.toString(user);
                } else {
                    out = out + Arrays.toString(user);
                }
            }
        }
        return out;
    }

    public String getAllUsersInfo() {
        return Arrays.deepToString(users);
    }

    public void updateUserInfo(String personalCode, String outdatedInfo, String newInfo) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][3].equals(personalCode)) { // identify user by personal code
                for (int j = 0; j < COLUMN_COUNT; j++) {
                    if (users[i][j].equals(outdatedInfo)) {
                        users[i][j] = newInfo;
                    }
                }
            }
        }
    }

    public String[][] deleteUser(String personalCode) {
        this.users = deleteEmptyRowFromArray(deleteUserInfoFromArray(personalCode));
        return this.users;
    }

    private String[][] deleteUserInfoFromArray(String personalCode) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][3].equals(personalCode)) { // identify user by personal code
                for (int j = 0; j < COLUMN_COUNT; j++) {
                    users[i][j] = null;
                }
            }
        }
        return users;
    }

    private String[][] deleteEmptyRowFromArray(String[][] users) {
        String[][] out = new String[users.length - 1][COLUMN_COUNT]; //new array will have less rows
        for (int row = 0; row < (users.length - 1); row++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
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
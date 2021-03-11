package students.alex_kalashnikov.lesson_7.level_7.task_16;

class UserEntity {

    private String idNumber;
    private String firstName;
    private String surname;

    public String getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    public String setSurname(String surname) {
        return this.surname = surname;
    }

    public String setIdNumber(String surname) {
        return this.idNumber = surname;
    }

    public String[][] createArray(int expectedClientAmount, int amountOfClientParameters) {
        String[][] arr = new String[expectedClientAmount][amountOfClientParameters];
        for (int i = 0; i < expectedClientAmount; i++) {
            for (int j = 0; j < amountOfClientParameters; j++) {
                arr[i][j] = "empty";
            }
        }
        return arr;
    }

    private int generateClientNumber(String[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0].equals("empty")) {
                count++;
            }
        }
        return arr.length - count;
    }

    void addUser(String[][] arr, String firstName, String surname, String idNumber) {
        int userNumber = generateClientNumber(arr);
        if (userNumber >= arr.length) {
            System.out.println("No more room for users! Please increase Array's size");
        } else {
            arr[userNumber][0] = setFirstName(firstName);
            arr[userNumber][1] = setSurname(surname);
            arr[userNumber][2] = setIdNumber(idNumber);
        }
    }

    String[][] findUserById(String[][] arr, String idNumber) {
        String[][] sortByIdNumberArr = new String[1][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2].equals(idNumber)) {
                sortByIdNumberArr[0][0] = arr[i][0];
                sortByIdNumberArr[0][1] = arr[i][1];
                sortByIdNumberArr[0][2] = arr[i][2];
                break;
            }
        }
        return sortByIdNumberArr;
    }

    String[][] findUserByFirstName(String[][] arr, String firstName) {
        int countIndex = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0].equals(firstName)) {
                countIndex++;
            }
        }
        String[][] sortByFirstNameArr = new String[countIndex][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0].equals(firstName)) {
                sortByFirstNameArr[count][0] = arr[i][0];
                sortByFirstNameArr[count][1] = arr[i][1];
                sortByFirstNameArr[count][2] = arr[i][2];
                count++;
            }
        }
        return sortByFirstNameArr;
    }

    String[][] findUserBySurname(String[][] arr, String surname) {
        int countIndex = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1].equals(surname)) {
                countIndex++;
            }
        }
        String[][] sortByFirstNameArr = new String[countIndex][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1].equals(surname)) {
                sortByFirstNameArr[count][0] = arr[i][0];
                sortByFirstNameArr[count][1] = arr[i][1];
                sortByFirstNameArr[count][2] = arr[i][2];
                count++;
            }
        }
        return sortByFirstNameArr;
    }

    String[][] findAllUsers(String[][] arr) {
        int countIndex = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i][1].equals("empty")) {
                countIndex++;
            }
        }
        String[][] allUsersArr = new String[countIndex][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i][1].equals("empty")) {
                allUsersArr[count][0] = arr[i][0];
                allUsersArr[count][1] = arr[i][1];
                allUsersArr[count][2] = arr[i][2];
                count++;
            }
        }
        return allUsersArr;
    }

    private int findUserNumberUsingId(String[][] arr, String idNumber) {
        int userNumber = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2].equals(idNumber)) {
                userNumber = i;
                break;
            }
        }
        return userNumber;
    }

    void editUser(String[][] arr, String currentIdNumber, String newFirstName, String newSurname, String newIdNumber) {
        int userNumber = findUserNumberUsingId(arr, currentIdNumber);
        arr[userNumber][0] = setFirstName(newFirstName);
        arr[userNumber][1] = setSurname(newSurname);
        arr[userNumber][2] = setIdNumber(newIdNumber);
    }

    void deleteUser(String[][] arr, String idNumber) {
        int userNumber = findUserNumberUsingId(arr, idNumber);
        arr[userNumber][0] = "empty";
        arr[userNumber][1] = "empty";
        arr[userNumber][2] = "empty";
        String[][] newArr = findAllUsers(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "empty";
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                arr[i][j] = newArr[i][j];
            }
        }
    }

}
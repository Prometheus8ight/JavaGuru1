package students.alex_kalashnikov.lesson_7.level_7.task_16;

class UserEntity {

    private String idNumber;
    private String firstName;
    private String surname;

    public static String setFirstName(String firstName) {
        return firstName;
    }

    public static String setSurname(String surname) {
        return surname;
    }

    public static String setIdNumber(String idNumber) {
        return idNumber;
    }

    public UserEntity(String idNumber, String firstName, String surname) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.surname = surname;
    }

}
package students.alex_kalashnikov.lesson_7.level_7.task_16;

class UserEntity {

    private int idNumber;
    private String firstName;
    private String surname;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public UserEntity(int idNumber, String firstName, String surname) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID number='" + idNumber + '\'' +
                ", First Name='" + firstName + '\'' +
                ", Surname='" + surname + '\'' +
                '}';
    }
}
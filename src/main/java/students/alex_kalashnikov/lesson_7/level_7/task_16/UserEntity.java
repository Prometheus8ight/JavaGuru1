package students.alex_kalashnikov.lesson_7.level_7.task_16;

class UserEntity {

    private int idNumber;
    private String firstName;
    private String surname;
    static int count = 1;

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

    public UserEntity(String firstName, String surname) {
        this.idNumber = count;
        this.firstName = firstName;
        this.surname = surname;
        count++;
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
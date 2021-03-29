package students.alex_kalashnikov.lesson_7.level_7.task_15;

class UserEntity {

    private long idNumber;
    private String firstName;
    private String surname;
    private long personalCode;

    public long getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public long getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "User Info {" +
                " ID number='" + getIdNumber() + '\'' +
                ", First name='" + getFirstName() + '\'' +
                ", Surname='" + getSurname() + '\'' +
                ", Personal code='" + getPersonalCode() + '\'' +
                '}';
    }

    public UserEntity(long idNumber, String firstName, String surname, long personalCode) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.surname = surname;
        this.personalCode = personalCode;
    }
}

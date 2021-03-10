package students.julija_katukova.lesson_7.level_7.task_16;

class UserEntity {

    private String id;
    private String name;
    private String surname;
    private String personalCode;

    UserEntity(String id, String name, String surname, String personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public int getNumberOfColumns() {
        return getClass().getDeclaredFields().length;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

}

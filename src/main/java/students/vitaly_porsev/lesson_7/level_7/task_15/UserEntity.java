package students.vitaly_porsev.lesson_7.level_7.task_15;

class UserEntity {
    private int id;
    private String name;
    private String surname;
    private int personalCode;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPersonalCode() {
        return personalCode;
    }
}
package students.deniss_jankovskis.lesson_7.task_16;

import java.util.Objects;
import java.util.UUID;

class UserEntity {

    private final UUID id;
    private String name;
    private String surname;
    private final String personalCode;

    public UserEntity(UUID id, String name, String surname, String personalCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) &&
                Objects.equals(name, userEntity.name) &&
                Objects.equals(surname, userEntity.surname) &&
                Objects.equals(personalCode, userEntity.personalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  "{ID = " + id +
                ", name ='" + name + '\'' +
                ", surname ='" + surname + '\'' +
                ", personalCode ='" + personalCode + '\'' +
                '}';
    }

}




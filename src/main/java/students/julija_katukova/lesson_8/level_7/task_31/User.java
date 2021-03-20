package main.java.students.julija_katukova.lesson_8.level_7.task_31;

import java.util.Objects;

class User {

    private String userId;
    private String name;
    private String surname;
    private String email;
    private int penalty;

    public User(String userId, String name, String surname, String email, int penalty) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.penalty = penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getPenalty() {
        return penalty;
    }

    public String getId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name, surname, email);
    }
}

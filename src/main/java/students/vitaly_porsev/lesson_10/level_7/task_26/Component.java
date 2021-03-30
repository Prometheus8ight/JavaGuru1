package students.vitaly_porsev.lesson_10.level_7.task_26;

import java.util.Objects;

class Component {

    private String title;
    private int number;

    public Component(String title, int number) {
        this.title = title;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(title, component.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return title;
    }
}

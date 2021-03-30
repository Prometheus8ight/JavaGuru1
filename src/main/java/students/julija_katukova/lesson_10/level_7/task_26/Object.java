package students.julija_katukova.lesson_10.level_7.task_26;

import java.util.Objects;

class Object {

    private String title;

    public Object(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Object{" +
                "title='" + title + '\'' +
                '}';
    }
}

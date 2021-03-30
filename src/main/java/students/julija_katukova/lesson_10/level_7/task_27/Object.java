package students.julija_katukova.lesson_10.level_7.task_27;

class Object {

    private final String title;

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
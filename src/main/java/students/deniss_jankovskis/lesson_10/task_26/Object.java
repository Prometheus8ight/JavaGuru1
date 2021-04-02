package students.deniss_jankovskis.lesson_10.task_26;

class Object {

    public String title;

    public Object(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Object{" +
                "title='" + title +
                '}';
    }
}
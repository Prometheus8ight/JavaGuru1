package students.kristine_paskevica.lesson_8.level_4;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimetr();

}

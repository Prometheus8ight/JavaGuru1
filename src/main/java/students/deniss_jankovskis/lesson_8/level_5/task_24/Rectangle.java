package students.deniss_jankovskis.lesson_8.level_5.task_24;

class Rectangle extends Shape {

    public double height, width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height = " + height +
                ", width = " + width +
                '}';
    }

}

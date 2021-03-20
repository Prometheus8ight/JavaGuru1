package students.kristine_paskevica.lesson_8.level_5.task_25;

class Rectangle extends Shape {

    private double malaA;
    private double malaB;

    Rectangle(String title, double malaA, double malaB) {
        super(title);
        this.malaA = malaA;
        this.malaB = malaB;
    }

    @Override
    double calculateArea() {
        return malaA * malaB;
    }

    @Override
    double calculatePerimeter() {
        return Math.pow((malaA + malaB), 2);
    }
}

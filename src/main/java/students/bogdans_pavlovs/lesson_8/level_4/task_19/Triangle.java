package students.bogdans_pavlovs.lesson_8.level_4.task_19;

class Triangle extends Shape {

    private double leftSide;
    private double rightSide;
    private double baseSide;
    private double height;

    Triangle(String title, double leftSide, double rightSide, double baseSide, double height){

        super(title);
        this.leftSide = leftSide;
        this.rightSide = rightSide;
        this.baseSide = baseSide;
        this.height = height;

    }

    @Override
    double calculateArea() {
        return (baseSide * height) / 2;
    }

    @Override
    double calculatePerimiter() {
        return leftSide + rightSide + baseSide;
    }

}

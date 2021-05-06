package students.alex_kalashnikov.lesson_15.level_2.task_5;

class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            discriminantGreaterThenZero(a, b, discriminant);
        } else if (discriminant == 0) {
            discriminantEqualZero(a, b);
        } else {
            discriminantLessThenZero();
        }
    }

    private void discriminantGreaterThenZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }

    private void discriminantEqualZero(double a, double b) {
        double x = -b / (2 * a);
        System.out.println("x = " + x);
    }

    private void discriminantLessThenZero() {
        System.out.println("Equation has no roots");
    }

}
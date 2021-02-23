package students.andrew_galashin.lesson_3.level_7.task_29;

class Circle {
    double radius;

        Circle(double circleRadius) {
            this.radius = circleRadius;
        }

            double calculateArea() {
                double s = Math.PI * (this.radius *this.radius);
                    System.out.println(s);
                        return s;
            }
}

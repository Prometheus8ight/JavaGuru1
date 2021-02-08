package students.arkadij.lesson_3.level_7.task_29;

class Circle {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    public void wrRad(){
        System.out.println("Write your radius: ");
    }

    double radius;
    double calculateArea;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void calculateArea(){
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Your calculated area is = " + area);
    }

}

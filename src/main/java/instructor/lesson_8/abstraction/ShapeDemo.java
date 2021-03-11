package instructor.lesson_8.abstraction;

import instructor.lesson_8.inheritance.Product;

class ShapeDemo {

    public static void main(String[] args) {

//        Square square = new Square("red", 4);
//        System.out.println("square.name() = " + square.name());
//        System.out.println("square.area() = " + square.area());
//        System.out.println("square.getColor() = " + square.getColor());
//
//        Shape circle = new Circle("blue", 3.0);
//        System.out.println("circle.name() = " + circle.name());
//        System.out.println("circle.area() = " + circle.area());
//        System.out.println("circle.getColor() = " + circle.getColor());
//
//        Shape rectangle = new Rectangle("green", 2, 5);
//        System.out.println("rectangle.name() = " + rectangle.name());
//        System.out.println("rectangle.area() = " + rectangle.area());
//        System.out.println("rectangle.getColor() = " + rectangle.getColor());

        Shape[] shapes = {
                new Square("red", 5),
                new Circle("blue", 3.0),
                new Rectangle("green", 2, 5)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
//            System.out.println(shape.name() + " : " + shape.area() + " : " + shape.getColor());
        }

    }
}

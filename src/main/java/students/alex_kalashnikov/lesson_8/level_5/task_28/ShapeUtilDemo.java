package students.alex_kalashnikov.lesson_8.level_5.task_28;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];

        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double circleArea = shapeUtil.calculateArea(shapes[0]);
        System.out.println("Circle area: " + circleArea);
        double squareArea = shapeUtil.calculateArea(shapes[1]);
        System.out.println("Square area: " + squareArea);
        double rectangleArea = shapeUtil.calculateArea(shapes[2]);
        System.out.println("Rectangle area: " + rectangleArea);
        double triangleArea = shapeUtil.calculateArea(shapes[3]);
        System.out.println("Triangle area: " + triangleArea);
        double totalArea = shapeUtil.calculateArea(shapes);
        System.out.println("TOTAL AREA: " + totalArea);


        double circlePerimeter = shapeUtil.calculatePerimeter(shapes[0]);
        System.out.println("Circle perimeter: " + circlePerimeter);
        double squarePerimeter = shapeUtil.calculatePerimeter(shapes[1]);
        System.out.println("Square perimeter: " + squarePerimeter);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(shapes[2]);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);
        double trianglePerimeter = shapeUtil.calculatePerimeter(shapes[3]);
        System.out.println("Triangle perimeter: " + trianglePerimeter);
        double totalPerimeter = shapeUtil.calculatePerimeter(shapes);
        System.out.println("TOTAL PERIMETER: " + totalPerimeter);

    }

}

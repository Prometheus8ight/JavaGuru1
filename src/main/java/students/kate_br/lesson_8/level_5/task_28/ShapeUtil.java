package students.kate_br.lesson_8.level_5.task_28;

import java.util.Random;

class ShapeUtil {

    double calculatePerimeter(Shape shape){
        return shape.calculatePerimeter();
    }

    double calculateArea(Shape shape){
        return shape.calculateArea();
    }

    double calculateArea(Shape[] shapes){

        double area = 0;
        for (Shape shape : shapes){
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes){

        double perimeter = 0;
        for (Shape shape : shapes){
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

     Circle createRandomCircle(){

         Random random = new Random();
         return new Circle("Circle", random.nextDouble());
     }

     Square createRandomSquare(){

         Random random = new Random();
         return new Square("Square", random.nextDouble());
     }

     Rectangle createRandomRectangle(){

         Random random = new Random();
         return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
     }

     Triangle createRandomTriangle(){

         Random random = new Random();
         return new Triangle("Triangle", random.nextDouble());
     }

     Shape createRandomShape(){

         Random rnd = new Random();
         int randomNumber = rnd.nextInt(4);
         if (randomNumber == 0){
             return createRandomCircle();
         }else if (randomNumber == 1){
             return createRandomSquare();
         }else if (randomNumber == 2){
             return createRandomRectangle();
         }else {
             return createRandomTriangle();
         }
     }


}

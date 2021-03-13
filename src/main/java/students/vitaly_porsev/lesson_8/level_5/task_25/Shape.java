package students.vitaly_porsev.lesson_8.level_5.task_25;

import java.util.Arrays;

abstract class Shape {

   public static void main(String[] args) {
      ShapeUtil shapeUtil = new ShapeUtil();
      Shape[] shapes = {shapeUtil.createRandomShape(), shapeUtil.createRandomShape(), shapeUtil.createRandomShape()};
      System.out.println(Arrays.toString(shapes));
      System.out.println(shapeUtil.calculateArea(shapes));
   }

   abstract double calculateArea();

   abstract double calculatePerimeter();
}
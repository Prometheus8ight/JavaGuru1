package students.vitaly_porsev.lesson_8.level_5.task_20;

public class CircleDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Circle circle = shapeUtil.createRandomCircle();
        System.out.println(circle);
    }
}
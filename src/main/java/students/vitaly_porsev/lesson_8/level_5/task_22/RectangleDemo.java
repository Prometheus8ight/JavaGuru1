package students.vitaly_porsev.lesson_8.level_5.task_22;

class RectangleDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Rectangle rectangle = shapeUtil.createRandomRectangle();
        System.out.println(rectangle);
    }
}
package students.deniss_jankovskis.lesson_8.level_5.task_23;

class TriangleDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Triangle triangle = shapeUtil.createRandomTriangle();

        System.out.println(triangle);
    }
}

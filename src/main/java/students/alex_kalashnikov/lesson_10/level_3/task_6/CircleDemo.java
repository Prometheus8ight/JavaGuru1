package students.alex_kalashnikov.lesson_10.level_3.task_6;

class CircleDemo {

    public static void main(String[] args) {

        Shape circle = (double size) -> size * size;
        System.out.println(circle.calculateArea(5));

    }

}
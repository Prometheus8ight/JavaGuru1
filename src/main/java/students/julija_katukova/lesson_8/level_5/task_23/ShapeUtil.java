package students.julija_katukova.lesson_8.level_5.task_23;

import java.util.Random;

class ShapeUtil {

    Triangle createRandomTriangle() {
        Random random = new Random();
        double sideA = random.nextInt(10);
        return new Triangle("triangle", sideA, sideA, sideA);
    }

}

package students.julija_katukova.lesson_8.level_5.task_20;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("circle", random.nextInt(10)); // chose next int to add bound to simplify calculations
    }

}

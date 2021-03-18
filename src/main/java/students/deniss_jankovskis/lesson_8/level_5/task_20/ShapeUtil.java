package students.deniss_jankovskis.lesson_8.level_5.task_20;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle(random.nextInt(100));
    }
}

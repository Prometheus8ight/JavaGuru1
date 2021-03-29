package students.deniss_jankovskis.lesson_8.level_5.task_23;

import java.util.Random;

class ShapeUtil {

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle(random.nextInt(100), random.nextInt(100),
                random.nextInt(100));
    }
}

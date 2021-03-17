package students.andrew_galashin.lesson_8.level_5.task_23;

import java.util.Random;

public class ShapeUtil {
    Triangle createRandomTriangle() {
        Random random = new Random();
        double a = random.nextInt(20);
        double h = random.nextInt(10);
        return new Triangle("Triangle", a, h);
    }
}

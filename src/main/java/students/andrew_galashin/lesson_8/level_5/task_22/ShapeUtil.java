package students.andrew_galashin.lesson_8.level_5.task_22;

import java.util.Random;

class ShapeUtil {
    Rectangle createRandomRectangle() {
        Random random = new Random();
        double x = random.nextInt(20);
        double y = random.nextInt(10);
        return new Rectangle("Rectangle", x, y);
    }
}

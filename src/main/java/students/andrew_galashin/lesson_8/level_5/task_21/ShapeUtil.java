package students.andrew_galashin.lesson_8.level_5.task_21;

import java.util.Random;

class ShapeUtil {
    Square createRandomSquare() {
        Random random = new Random();
        return new Square(random.nextInt(20));
    }
}

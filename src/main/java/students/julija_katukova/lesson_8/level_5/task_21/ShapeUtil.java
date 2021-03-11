package students.julija_katukova.lesson_8.level_5.task_21;

import java.util.Random;

class ShapeUtil {
    Square createRandomSquare(){
        Random random = new Random();
        return new Square("square", random.nextInt(10));
    }
}

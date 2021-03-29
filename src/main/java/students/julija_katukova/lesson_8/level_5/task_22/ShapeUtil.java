package students.julija_katukova.lesson_8.level_5.task_22;

import java.util.Random;

class ShapeUtil {

    Rectangle createRandomRectangle(){
        Random random = new Random();
        return new Rectangle("rectangle", random.nextInt(10), random.nextInt(10));
    }

}

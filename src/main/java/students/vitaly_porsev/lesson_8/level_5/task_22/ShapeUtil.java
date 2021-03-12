package students.vitaly_porsev.lesson_8.level_5.task_22;

import java.util.Random;

class ShapeUtil {

    Rectangle createRandomRectangle(){
        Random random = new Random();
        return new Rectangle(random.nextInt(100), random.nextInt(200));
    }
}
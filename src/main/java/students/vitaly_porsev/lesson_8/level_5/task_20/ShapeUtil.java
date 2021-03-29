package students.vitaly_porsev.lesson_8.level_5.task_20;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle(){
        Random random = new Random();
        return new Circle(random.nextInt(500));
    }
}
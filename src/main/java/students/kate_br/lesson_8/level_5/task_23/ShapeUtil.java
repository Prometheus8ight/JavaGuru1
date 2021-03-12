package students.kate_br.lesson_8.level_5.task_23;

import java.util.Random;

class ShapeUtil {

    Triangle createRandomTriangle(){

        Random random = new Random();
        return new Triangle("Triangle", random.nextDouble());
    }
}

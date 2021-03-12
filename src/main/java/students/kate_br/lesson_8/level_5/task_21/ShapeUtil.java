package students.kate_br.lesson_8.level_5.task_21;

import java.util.Random;

class ShapeUtil {

     Square createRandomSquare(){

         Random random = new Random();
         return new Square("Square", random.nextDouble());
     }
}

package students.kate_br.lesson_8.level_5.task_22;

import java.util.Random;

class ShapeUtil {

     Rectangle createRandomRectangle(){

         Random random = new Random();
         return new Rectangle("Rectangle", random.nextDouble(), random.nextDouble());
     }
}

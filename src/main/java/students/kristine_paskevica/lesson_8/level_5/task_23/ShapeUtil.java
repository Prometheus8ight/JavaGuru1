package students.kristine_paskevica.lesson_8.level_5.task_23;

import java.util.Random;

class ShapeUtil {

     Triangle createRandomTriangle() {
         Random random = new Random();
         double trijstMala = random.nextInt(8);
         return new Triangle("trīstūris", trijstMala);
     }
}

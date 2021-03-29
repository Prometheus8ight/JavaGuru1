package students.kristine_paskevica.lesson_8.level_5;

import java.util.Random;

class ShapeUtil {

     Circle createRandomCircle() {
         Random random = new Random();
         return new Circle("circle", random.nextInt(10));
     }
 }

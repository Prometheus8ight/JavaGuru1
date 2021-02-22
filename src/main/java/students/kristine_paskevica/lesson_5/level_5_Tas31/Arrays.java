package students.kristine_paskevica.lesson_5.level_5_Tas31;

import java.util.Random;

class Arrays {


    public int[] create(int length) {

         return new int[length];    // izveido metodi, lai izveidotu masīvu ar norādītu tā garumu
     }
     public void fillRandomly(int[] array) {
         Random random = new Random();

         for (int i =0; i <array.length; i++){
             array[i] = random.nextInt(15);
         }
     }
 }

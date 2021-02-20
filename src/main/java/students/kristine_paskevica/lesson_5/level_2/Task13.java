package students.kristine_paskevica.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task13 {

     public static void main(String[] args) {

         int [] masivs = new int [3];
         int sum = 0;

         Random genereSkaitlus = new Random();

         for (int i = 0; i < 3; i++){
             masivs[i] = genereSkaitlus.nextInt();
             //aizpilda ar nejaušiem veseliem skaitļiem katra masīva šūnu

             sum = sum + masivs[i];
             //saskaita visu 3 skaitļus
         }
         System.out.println("Masīva šūnās glabājas šādas 3 vērtības: " + Arrays.toString(masivs) + ". \n Visu trīs skaitļu kopējā summa ir: " + sum);
     }
}

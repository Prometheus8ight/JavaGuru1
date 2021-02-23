package students.kristine_paskevica.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task14 {

     public static void main(String[] args) {
         int[] masivs = new int[3];
         int sum = 0;
         int avg = 0;

         Random genereSkaitlus = new Random();

         for (int i = 0; i < masivs.length; i++) {
             masivs[i] = genereSkaitlus.nextInt();
             //aizpilda ar nejaušiem veseliem skaitļiem katra masīva šūnu

             sum += masivs[i];
             //saskaita visu 3 skaitļus
             avg = sum / 3;
             //aprēķina vidējo
         }
         System.out.println("Masīva šūnās glabājas šādas 3 vērtības: " + Arrays.toString(masivs) + ". \n Visu trīs skaitļu vidējā summa ir: " + avg);
     }
}


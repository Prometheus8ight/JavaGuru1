package students.kristine_paskevica.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {

     public static void main(String[] args) {
         Scanner masivaInfo = new Scanner(System.in);

         System.out.println("Norādiet, cik garu vēlaties masīvu, jeb no cik elementiem tas veidosies.");
         int masivaGarums = masivaInfo.nextInt();
         int [] masivs = new int[masivaGarums];

         Random genereSkaitlus = new Random();

         for (int i = 0; i < masivaGarums; i++){
             masivs[i] = genereSkaitlus.nextInt();
         }
         System.out.println("Masīva šūnās glabājas šādas vērtības: " + Arrays.toString(masivs));
     }
}

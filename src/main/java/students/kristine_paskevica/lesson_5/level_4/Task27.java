package students.kristine_paskevica.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task27 {

    public static void main(String[] args) {

    int [] masivs = new int[6];

    Random genereSkaitlus = new Random();

         for (int i = 0; i < 6; i ++){
            masivs[i] = genereSkaitlus.nextInt();
    }
         System.out.println("Masīva šūnās glabājas šādas vērtības: " + Arrays.toString(masivs));
         System.out.println("Vislielākais no masīvā esošiem skaitļiem ir: " + Arrays.stream(masivs).max().getAsInt());
}
}



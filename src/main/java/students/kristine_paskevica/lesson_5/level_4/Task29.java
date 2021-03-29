package students.kristine_paskevica.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task29 {

    public static void main(String[] args) {

        int [] masivs = new int[6];

        Random genereSkaitlus = new Random();

        for (int i = 0; i < 6; i ++){
            masivs[i] = genereSkaitlus.nextInt();
        }
        System.out.println("Masīva šūnās glabājas šādas vērtības: " + Arrays.toString(masivs));
        for (int i = 0; i < 6; i++){
            if(masivs[i] % 2 == 0){
               System.out.println("Masīva atrodas šāds pāra skaitlis: " + masivs[i]);
            }
        }
    }
}

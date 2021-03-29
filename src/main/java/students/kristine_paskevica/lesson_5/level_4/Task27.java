package students.kristine_paskevica.lesson_5.level_4;

import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        int[] masivs = new int[6];                     //izveido masīvu ar 6 elementiem
        int max = masivs[0];

        Random genereSkaitlus = new Random();

        for (int i = 0; i < masivs.length; i++) {       //aizpildam masīvu ar nejaušiem sk
            masivs[i] = genereSkaitlus.nextInt();
        }
        System.out.println("Masīva šūnās glabājas šādas vērtības: ");   //izdrukā visus masīva elementus
        for (int i = 0; i < masivs.length; i++) {
            System.out.println(masivs[i]);

            if (masivs[i] > max) {                      //atrodam max masīva vērtību
                max = masivs[i];
            }
        }
        System.out.println("Vislielākais no masīvā esošiem skaitļiem ir: " + max);
    }
}



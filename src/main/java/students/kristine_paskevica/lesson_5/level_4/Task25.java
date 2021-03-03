package students.kristine_paskevica.lesson_5.level_4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {

        Scanner masivaInfo = new Scanner(System.in);

        System.out.println("Norādiet, cik garu vēlaties masīvu, jeb no cik elementiem tas veidosies.");
        int garums = masivaInfo.nextInt();
        int [] masivs = new int[garums];

        for (int i = 0; i < garums; i++){
            System.out.println("Ievadiet masīva elementu vērtības: ");      //notiks masīva aizpildīšana ar vērtībām
            masivs[i] = masivaInfo.nextInt();
        }
        System.out.println("Jūsu masīvs aizpildās ar šādiem elementiem: " + Arrays.toString(masivs));
    }
}


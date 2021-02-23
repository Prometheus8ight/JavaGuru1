package students.kristine_paskevica.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {

     public static void main(String[] args) {
         Scanner skaitli = new Scanner(System.in);

         int [] masivs = new int[3];

         System.out.println("Ievadiet jebkurus 3 veselus skaitļu!");

         int skPirmais = skaitli.nextInt();
         int skOtrais = skaitli.nextInt();
         int skTresais = skaitli.nextInt();

         masivs[0] = skPirmais;
         masivs[1] = skOtrais;
         masivs[2] = skTresais;


         System.out.println("Masīva šūnās glabājas šādas 3 vērtības: " + Arrays.toString(masivs));
         //izvada visa masīva saturu

     }
}

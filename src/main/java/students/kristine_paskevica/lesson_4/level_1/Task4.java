package students.kristine_paskevica.lesson_4.level_1;
import java.util.Scanner;
 class Task4 {
     public static void main(String[] args) {
         Scanner info = new Scanner(System.in);
         System.out.println("Ievadiet vienu veselu skaitli");

         int skaitlis = info.nextInt();

         int dalijums = skaitlis % 2;

         if (dalijums == 0){
             System.out.println("Tas ir pāra skaitlis!");
         }
         else if (dalijums != 0){
             System.out.println("Tas ir nepāra skaitlis!");
         }}}

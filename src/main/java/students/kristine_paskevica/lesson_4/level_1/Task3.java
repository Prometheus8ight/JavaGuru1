package students.kristine_paskevica.lesson_4.level_1;

import java.util.Scanner;

class Task3 {

   public static void main(String[] args) {
   Scanner info = new Scanner(System.in);
   System.out.println("Ievadiet vienu veselu skaitli intervālā no 1-7!");

    byte skaitlis = info.nextByte();

       switch (skaitlis) {
           case 1:
               System.out.println("Tā ir pirmdiena");
               break;
           case 2:
               System.out.println("Tā ir otrdiena");
               break;
           case 3:
               System.out.println("Tā ir trešdiena");
               break;
           case 4:
               System.out.println("Tā ir ceturdiena");
               break;
           case 5:
               System.out.println("Tā ir piektdiena");
               break;
           case 6:
               System.out.println("Tā ir sestdiena");
               break;
           case 7:
               System.out.println("Tā ir svētdiena");
           default:
               System.out.println("Jūs ievadījāt neatbilstošu skaitli, mēģiniet vēlreiz!");

  }}}

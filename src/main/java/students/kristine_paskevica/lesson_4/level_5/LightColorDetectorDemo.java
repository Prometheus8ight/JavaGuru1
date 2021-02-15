package students.kristine_paskevica.lesson_4.level_5;

import java.util.Scanner;

class LightColorDetectorDemo {

     public static void main(String[] args) {

         LightColorDetector noteicejs = new LightColorDetector();

         Scanner skaitlis = new Scanner(System.in);
         System.out.println("Ievadiet jabkuru veselu skaitli intervālā no 380 - 750, lai noteiktu kādam krāsas spektram tas atbilst!");

         int vilnaGarums = skaitlis.nextInt();

         String krasasNos = noteicejs.noteikts(vilnaGarums);

         System.out.println("Jūsu ievadītais skaitlis atbilst šādam krāsas spektram: " + krasasNos);

     }
}

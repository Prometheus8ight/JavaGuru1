package students.kristine_paskevica.lesson_4.level_2;

import java.util.Scanner;

class Task5 {

     public static void main(String[] args) {
         Scanner info = new Scanner(System.in);
         System.out.println("Ievadiet divus jebkurus veselus skaitļus!");
         int skaitlis1 = info.nextInt();
         int skaitlis2 = info.nextInt();


         if (skaitlis1 > skaitlis2){
             System.out.println("Ievadītais skaitlis " + skaitlis1 + " ir lielāks nekā skaitlis " + skaitlis2);
         }
         else if (skaitlis1 < skaitlis2){
             System.out.println("Ievadītais skaitlis " + skaitlis2 + " ir lielāks nekā skaitlis " + skaitlis1);
         }   }}

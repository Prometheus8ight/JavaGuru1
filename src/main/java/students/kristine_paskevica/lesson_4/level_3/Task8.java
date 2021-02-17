package students.kristine_paskevica.lesson_4.level_3;

import java.util.Scanner;

class Task8 {

  public static void main(String[] args) {

    Scanner info = new Scanner(System.in);
    System.out.println("Ievadiet trīs vesela tipa skaitļus!");
    int skaitlis1 = info.nextInt();
    int skaitlis2 = info.nextInt();
    int skaitlis3 = info.nextInt();

    if (skaitlis2 == skaitlis3 && skaitlis3 == skaitlis1 && skaitlis2 == skaitlis1)
    {
      System.out.println("Visi trīs skaitļi ir vienādi!");
    }
      else if (skaitlis1 != skaitlis2 && skaitlis2 != skaitlis3 && skaitlis3 != skaitlis1){
        System.out.println("Visi trīs skaitļi "+ skaitlis1 +", " + skaitlis2 + ", un skaitlis "+skaitlis3 +" ir atšķirīgi!");
    }
        else{
          System.out.println("Neviens no ievadītajiem skaitļiem nav vienāds vai atšķirīgi!");
    }}}

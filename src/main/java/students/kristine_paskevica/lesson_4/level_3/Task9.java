package students.kristine_paskevica.lesson_4.level_3;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.println("Ievadiet trīs vesela tipa skaitļus!");
        int skaitlis1 = info.nextInt();
        int skaitlis2 = info.nextInt();
        int skaitlis3 = info.nextInt();

        if (skaitlis1 < skaitlis2 && skaitlis2 < skaitlis3 && skaitlis3 > skaitlis1)
        {
            System.out.println("Ievadītie skaitļi izkārtojas pieaugošā secībā");
        }
                else if (skaitlis1 > skaitlis2 && skaitlis2 > skaitlis3 && skaitlis3 < skaitlis1){
                    System.out.println("Ievadītie skaitļi izkārtojas dilstošā secībā");
        }
                    else{
                        System.out.println("Ievadītie skaitļi izkārtojas jauktā secībā");
        }}}


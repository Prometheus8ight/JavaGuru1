package students.kristine_paskevica.lesson_4.level_3;

import java.util.Scanner;

class Task10 {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.println("Ievadiet trīs vesela tipa skaitļus!");
        int skaitlis1 = info.nextInt();
        int skaitlis2 = info.nextInt();
        int skaitlis3 = info.nextInt();

            if (skaitlis1 > skaitlis2 && skaitlis1 > skaitlis3){
                System.out.println("Skaitlis " + skaitlis1 + " ir lielāks par pārējiem skaitļiem " + skaitlis2 + " un " + skaitlis3);
            }
                    else if (skaitlis2 > skaitlis1 && skaitlis2 > skaitlis3){
                        System.out.println("Skaitlis " + skaitlis2 + " ir lielāks par pārējiem skaitļiem " + skaitlis1 + " un " + skaitlis3);
            }
                        else{
                            System.out.println("Skaitlis " + skaitlis3 + " ir lielāks par pārējiem skaitļiem " + skaitlis1 + " un " + skaitlis2);
            }}}

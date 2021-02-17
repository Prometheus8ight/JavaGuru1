package students.kristine_paskevica.lesson_4.level_1;

import java.util.Scanner;

class Task2 {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Ievadiet jebkādu veselu skaitli!");
        int skaitlis = info.nextInt();

        if(skaitlis > 0) {
            System.out.println("Tas ir pozitīvs skaitlis!");
        }
        else if (skaitlis < 0){
            System.out.println("Tas ir negatīvs skaitlis!");
        }
        else{
            System.out.println("Jūs ievadījāt nulli!");
        }
    }}



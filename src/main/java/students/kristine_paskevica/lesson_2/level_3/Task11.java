package students.kristine_paskevica.lesson_2.level_3;
import java.util.Scanner;
class Task11 {
    public static void main(String[] args) {

        Scanner skaitli = new java.util.Scanner(System.in);
        System.out.println("Ievadiet vienu veselu skaitli!");
        int pirmaisSk = skaitli.nextInt();

        System.out.println("Ievadiet vēl vienu veselu skaitli!");
        int otraisSk = skaitli.nextInt();

        System.out.println("Ievadiet vēl trešo veselu skaitli!");
        int tresaisSk = skaitli.nextInt();

        System.out.println("Ievadīto skaitļu vidējais aritmētiskais ir: " + ((double)(pirmaisSk + otraisSk + tresaisSk)/3));
}}

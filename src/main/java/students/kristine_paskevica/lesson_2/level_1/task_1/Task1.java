package students.kristine_paskevica.lesson_2.level_1.task_1;
import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Ievadiet vienu jebkuru veselu skaitli!");
        int pirmaisSk = numbers.nextInt();

        System.out.println("Ievadiet vēl vienu jebkuru veselu skaitli!");
        int otraisSk = numbers.nextInt();

        int skSum = pirmaisSk + otraisSk;
        int skAtnem = pirmaisSk - otraisSk;
        int skReizin = pirmaisSk * otraisSk;
        double skDalisana = (double) pirmaisSk / otraisSk;

        System.out.println("Abu skaitļu summa ir: " + skSum);
        System.out.println("Abu skaitļu starpība ir: " + skAtnem);
        System.out.println("Abu skaitļu reizinājums ir: " + skReizin);
        System.out.println("Abu skaitļu dalījums ir: " + skDalisana);
    }}

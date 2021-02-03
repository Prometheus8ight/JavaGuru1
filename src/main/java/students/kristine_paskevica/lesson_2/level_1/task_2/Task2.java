package students.kristine_paskevica.lesson_2.level_1.task_2;
import java.util.Scanner;
class Task2 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Ievadiet vienu jebkuru decimālo skaitļi!");
        double pirmaisDecimSk = numbers.nextDouble();

        System.out.println("Ievadiet vēl vienu jebkuru decimālo skaitli!");
        double otraisDecimSk = numbers.nextDouble();

        double skSum = pirmaisDecimSk + otraisDecimSk;
        double skAtnem = pirmaisDecimSk - otraisDecimSk;
        double skReizin = pirmaisDecimSk * otraisDecimSk;
        double skDalisana = pirmaisDecimSk / otraisDecimSk;

        System.out.println("Abu skaitļu summa ir: " + skSum);
        System.out.println("Abu skaitļu starpība ir: " + skAtnem);
        System.out.println("Abu skaitļu reizinājums ir: " + skReizin);
        System.out.println("Abu skaitļu dalījums ir: " + skDalisana);
}}

package students.kristine_paskevica.lesson_2.level_3;
import java.util.Scanner;
class Task9 {
    public static void main(String[] args) {
        System.out.println("Ievadiet vienu veselu skaitli intervālā no 1 - 10");
        Scanner skaitli = new java.util.Scanner(System.in);

        byte ievadSk = skaitli.nextByte();
        System.out.println("Reizinājumi Jūsu ievadītajam skaitlim no 1 līdz 10 ir sekojošs!");
        System.out.println(ievadSk + " * 1 = " + (ievadSk * 1));
        System.out.println(ievadSk + " * 2 = " + (ievadSk * 2));
        System.out.println(ievadSk + " * 3 = " + (ievadSk * 3));
        System.out.println(ievadSk + " * 4 = " + (ievadSk * 4));
        System.out.println(ievadSk + " * 5 = " + (ievadSk * 5));
        System.out.println(ievadSk + " * 6 = " + (ievadSk * 6));
        System.out.println(ievadSk + " * 7 = " + (ievadSk * 7));
        System.out.println(ievadSk + " * 8 = " + (ievadSk * 8));
        System.out.println(ievadSk + " * 9 = " + (ievadSk * 9));
        System.out.println(ievadSk + " * 10 = " + (ievadSk * 10));
    }
}

package students.kristine_paskevica.lesson_2.level_3;
import java.util.Scanner;
class Task10 {

    public static void main(String[] args) {
        System.out.println("Ievadiet riņķa līnijas rādiusu");
        Scanner rinkaLinija = new java.util.Scanner(System.in);

        double rinkaLinRad = rinkaLinija.nextDouble();

        System.out.println("Riņķa līnijas perimetrs ir: " + (2*3.14*rinkaLinRad));
        System.out.println("Riņķa līnijas laukums ir: " + (3.14*rinkaLinRad*rinkaLinRad));
}
}


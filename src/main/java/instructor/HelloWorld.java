package instructor;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("It is a great day today!");
        System.out.println("Yet another update");
        System.out.println("It is sunday!");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        System.out.println("Спасибо! Вы ввели число " + number);
    }
}

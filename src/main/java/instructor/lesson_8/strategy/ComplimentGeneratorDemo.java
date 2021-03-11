package instructor.lesson_8.strategy;

import java.util.Scanner;

class ComplimentGeneratorDemo {

    public static void main(String[] args) {

        ComplimentGeneratorDemo demo = new ComplimentGeneratorDemo();
        AbstractComplimentGenerator generator = demo.prompt();

        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }

    }

    public AbstractComplimentGenerator prompt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your age group:");
        System.out.println("1. Junior");
        System.out.println("2. Adult");
        System.out.println("3. Senior");

        int group = scanner.nextInt();

        return switch (group) {
            case 1 -> new JuniorComplimentGenerator();
            case 2 -> new AdultComplimentGenerator();
            case 3 -> new SeniorComplimentGenerator();
            default -> null;
        };
    }
}

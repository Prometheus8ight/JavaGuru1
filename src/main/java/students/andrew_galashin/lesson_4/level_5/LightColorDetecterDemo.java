package students.andrew_galashin.lesson_4.level_5;

import java.util.Scanner;

class LightColorDetecterDemo {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 380 - 750: ");
        int x = scanner.nextInt();
        String waveColor = detector.color(x);
        System.out.println("Your color is " +waveColor);
    }
}

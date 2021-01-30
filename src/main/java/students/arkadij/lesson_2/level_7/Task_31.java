package students.arkadij.lesson_2.level_7;

public class Task_31 {
    public static void main(String[] args) {

        System.out.println("Hello stranger!");
        // мы приветствуем странника

        System.out.println("Did you find me easily or not?" + " Write please true or false below:");
        // задаём вопрос страннику и направляем его на узский провиль ответов

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean answer = scanner.nextBoolean();

        if (answer == true) {
            System.out.println("Well done, i knew you could do it.");
        }
        else if (answer == false) {
            System.out.println("I thought you were capable of more.");
        }
        /*
        так же могут быть другие варианты ответов в зависимости от выбора странника:

        if (answer == true) {
            System.out.println("Good, well done!");
        }
        else if (answer == false) {
            System.out.println("It's really sad.");
        }
         */
    }
}

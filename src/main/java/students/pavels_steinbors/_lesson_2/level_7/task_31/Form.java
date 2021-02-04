package students.pavels_steinbors._lesson_2.level_7.task_31;

class Form {
    public static void main(String[] args) {
// Назову зто задание - коротко о себе :)
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Ваше Имя: " );
        String name = scanner.next(); /*Обозначу просто многострочный
        коментарий */

        System.out.println("Ваша фамилия: ");
        String surname = scanner.next();

        System.out.println("Ваш возраст: ");
        String age = scanner.next();

        System.out.println("Ваш рост: ");
        String height = scanner.next();

        System.out.println("В каком городе Вы родились: ");
        String city = scanner.next();

        System.out.println("Hello! My name is " + name);
        System.out.println("And my surname is " + surname);
        System.out.println("I am " + age + "years old");
        System.out.println("My height is " + height + "cm");
        System.out.println("I was born in " + city);
        System.out.println("Shortly about myself! :)");




    }



}

package students.alex_kalashnikov.lesson_3.level_2.task_9;

class Name {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String yourName= scanner.next();

        String name = yourName;
        System.out.println("Hi, " + name + "!");

    }

}

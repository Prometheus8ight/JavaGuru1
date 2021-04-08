package students.rodion_afanasjev.lesson_12.level_1.task_5;

import java.util.Scanner;

class ExceptionDemo extends Exception {

    public static void main(String[] args) throws Exception {

        ExceptionDemo demo = new ExceptionDemo();
        demo.digitException();

    }

    public String digitException() throws ExceptionDemo {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 3 digit number: ");
        String line = scan.nextLine();
        while (true) {
            if (line.length() == 3) {
                try {
                    int digit = Integer.parseInt(line);
                    break;
                } catch (NumberFormatException e) {
                    throw new ExceptionDemo("No numbers found");
                }
            }

            System.out.println("Error!(" + line + ") Please enter a 3 digit number: ");
            line = scan.nextLine();
        }

        return line;
    }



    public ExceptionDemo() {
    }

    public ExceptionDemo(String message) {
        super(message);
    }

}

package students.vitaly_porsev.lesson_12.level_1.task_5;

import java.io.File;
import java.util.Scanner;

public class ExceptionDemo extends Exception {
    public static void main(String[] args) throws Exception {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.UserInputException();

    }

    public void fileException() throws Exception {
        File file = new File("asd");
        try {
            Scanner scanner = new Scanner(file);
        } catch (Exception e) {
            throw new ExceptionDemo("Файл не не найден!");
        }
    }

    public void UserInputException() throws ExceptionDemo {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());
            if (x == 0) {
                throw new ExceptionDemo("Пользаватель ввёл ноль!");
            }
        }
    }

    public ExceptionDemo() {
    }

    public ExceptionDemo(String message) {
        super(message);
    }
}

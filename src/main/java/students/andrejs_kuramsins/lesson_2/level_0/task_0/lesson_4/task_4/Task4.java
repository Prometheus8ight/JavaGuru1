package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_4;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number :");
        int number = scanner.nextInt();
        int result = number &2;
                if (result ==2){
                    System.out.println("True");}
                    else  {
                    System.out.println("False");


                }
    }
}

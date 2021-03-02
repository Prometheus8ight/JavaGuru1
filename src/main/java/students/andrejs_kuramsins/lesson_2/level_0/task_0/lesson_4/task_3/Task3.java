package students.andrejs_kuramsins.lesson_2.level_0.task_0.lesson_4.task_3;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number from 1 to 7 :");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Monday");}
            else if (number ==2)
            System.out.println("Tuesday");
            else if (number == 3)
            System.out.println("Wednesday");
            else if (number == 4)
            System.out.println("Thursday");
            else if (number==5)
            System.out.println("Friday");
            else if (number==6)
            System.out.println("Saturday");
            else if (number==7){
            System.out.println("Sunday");}
            else if (number <1){
        System.out.println("I asked from 1....");}
            else if (number >7)
            System.out.println("I asked to 7....");

    }

    }



package students.bogdans_pavlovs.lesson_4.level_1.task_3;

import java.util.Scanner;

class Week {

    public static void main(String[] args) {


        Scanner pickDay = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 7: ");

        int yourNumber = pickDay.nextInt();

        if (yourNumber >= 1 && yourNumber <= 7){

            switch (yourNumber) {

                case 1:
                    System.out.println(yourNumber + " is for Monday!");
                    break;

                case 2:
                    System.out.println(yourNumber + " is for Tuesday!");
                    break;

                case 3:
                    System.out.println(yourNumber + " is for Wednesday!");
                    break;

                case 4:
                    System.out.println(yourNumber + " is for Thursday!");
                    break;

                case 5:
                    System.out.println(yourNumber + " is for Friday!");
                    break;

                case 6:
                    System.out.println(yourNumber + " is for Saturday!");
                    break;

                case 7:
                    System.out.println(yourNumber + " is for Sunday!");
                    break;
            }

        }else {

            System.out.println("You'll have to try again buddy..");
        }

    }

}


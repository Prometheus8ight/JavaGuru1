package students.Dmitry_Gr.lesson_6.level_2.task_7;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    boolean isValid;
    String input;
    int number;
    Scanner console = new Scanner(System.in);

    public int getDayNumberFromUser() {
        do {
            isValid = false; // reset the validity
            System.out.print("Input day number between 1 and 7 : ");
            input = console.nextLine();
            number = Integer.parseInt(input);
            if ( number >= 1 && number <= 7 ) { isValid = true; }


        } while (!isValid);
        return number;
    }



    public String findDayOfTheWeek(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not correct day number";
        };
    }


}

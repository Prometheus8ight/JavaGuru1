package students.kristine_paskevica.lesson_6.level_2.task_7;

import java.util.Scanner;

class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {                //veido metodi, kura nodrošina informācijas pieprasīšanu no lietotāja, bez ieejas parametriem atgriežot int tipa vērtību
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {     //veido metodi, lai izskaitļotu norādīto nedēļas dienu-tās nosaukumu, ar ieejas parametriem-dienas numurs
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

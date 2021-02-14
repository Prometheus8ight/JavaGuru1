package students.alex_kalashnikov.lesson_4.level_1.task_3;

class DayOfTheWeek {

    public static void main(String[] args) {

        boolean x = true;

        while (x == true) {  // если набрано значение не равное [1 - 7], то заново перезапускает программу.

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter day of the week (number 1 - 7): ");
            int dayNumber = scanner.nextInt();


            switch (dayNumber) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        System.out.println("Error! Please enter correct data!");

                }
            if (dayNumber > 1 && dayNumber < 7) {
                x = false; // если значение набрано верно, то прекращает цикл.
            }
        }
    }
}
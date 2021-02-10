package instructor.lesson_4;

public class SwitchDemo {

    public static void main(String[] args) {

        String today = "monday";

        switch (today) {
            case "monday":
            case "tuesday":
            case "wednesday":
                System.out.println("1-3");
                break;
            case "thursday":
            case "friday":
                System.out.println("4-5");
                break;
            case "saturday":
            case "sunday":
                System.out.println("6-7");
                break;
        }


        String drink = "coffee";

        switch (drink.toLowerCase()) {
            case "coffee":
                System.out.println("COFFEE"); // 1
                break;
            case "tea":
                System.out.println("TEA"); // 2
                break;
            case "soda":
                System.out.println("SODA"); // 3
//                break;
            default:
                System.out.println("NEITHER"); // 4
        }

    }
}

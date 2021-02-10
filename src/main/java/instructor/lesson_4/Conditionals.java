package instructor.lesson_4;

public class Conditionals {

    public static void main(String[] args) {

        int x = 10;

        boolean isTen = x == 10; // true
        boolean isOne = x == 1;  // false

        boolean isNotFive = x != 5; // true
        boolean isNotTen = x != 10; // false

        boolean isGreaterThanFive = x > 5; // true
        boolean isGreaterThanTen = x > 10; // false

        boolean isGreaterThanOrEqualToTen = x >= 10; // true

        boolean isLesserThanTwelve = x < 12; // true
        boolean isLesserThanOrEqualToTwelve = x <= 12; // true

        System.out.println("isTen = " + isTen);
        System.out.println("isOne = " + isOne);

        System.out.println("isNotFive = " + isNotFive);
        System.out.println("isNotTen = " + isNotTen);

        System.out.println("isGreaterThanFive = " + isGreaterThanFive);
        System.out.println("isGreaterThanTen = " + isGreaterThanTen);

        System.out.println("isGreaterThanOrEqualToTen = " + isGreaterThanOrEqualToTen);

        System.out.println("isLesserThanTwelve = " + isLesserThanTwelve);
        System.out.println("isLesserThanOrEqualToTwelve = " + isLesserThanOrEqualToTwelve);

        if (isTen) {
            // TODO
        }

        if (x == 10) {
            // TODO
        }

        // ----

        boolean is_Gr_0_and_Lr_100 = x > 0 && x < 100; // true
        boolean is_Gr_0_or_Lr_100 = x >= 0 || x < 0;   // true

        boolean negateTrue = !true;   // false
        boolean negateFalse = !false; // true

        boolean negateNegateTrue = !!true; // true -> false -> true

        if (!(x > 0 && x < 100)) {

        }

    }
}

package students.vitaly_porsev.lesson_15.level_6_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import students.vitaly_porsev.lesson_15.level_6.allTasks.Customer;
import students.vitaly_porsev.lesson_15.level_6.allTasks.Movie;
import students.vitaly_porsev.lesson_15.level_6.allTasks.Rental;

public class CustomerTests {

    @Test
    void new_Release_1_day() {
        Customer customer = new Customer("George");
        customer.addRental(new Rental(new Movie("Sicario", "NEW_RELEASE"), 1));

        String expectedResult = "Rental Record for George\n" +
                "\tSicario\t3.0\n" +
                "You owed 3.0\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void new_Release_2_day() {
        Customer customer = new Customer("George");
        customer.addRental(new Rental(new Movie("Sicario", "NEW_RELEASE"), 3));

        String expectedResult = "Rental Record for George\n" +
                "\tSicario\t9.0\n" +
                "You owed 9.0\n" +
                "You earned 2 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void new_Release_10_day() {
        Customer customer = new Customer("George");
        customer.addRental(new Rental(new Movie("Sicario", "NEW_RELEASE"), 10));

        String expectedResult = "Rental Record for George\n" +
                "\tSicario\t30.0\n" +
                "You owed 30.0\n" +
                "You earned 2 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void regular_1_day() {
        Customer customer = new Customer("Homer");
        customer.addRental(new Rental(new Movie("Spotlight", "REGULAR"), 1));

        String expectedResult = "Rental Record for Homer\n" +
                "\tSpotlight\t2.0\n" +
                "You owed 2.0\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void regular_3_day() {
        Customer customer = new Customer("Homer");
        customer.addRental(new Rental(new Movie("Spotlight", "REGULAR"), 3));

        String expectedResult = "Rental Record for Homer\n" +
                "\tSpotlight\t3.5\n" +
                "You owed 3.5\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void regular_10_day() {
        Customer customer = new Customer("Homer");
        customer.addRental(new Rental(new Movie("Spotlight", "REGULAR"), 10));

        String expectedResult = "Rental Record for Homer\n" +
                "\tSpotlight\t14.0\n" +
                "You owed 14.0\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void childrens_1_Day() {
        Customer customer = new Customer("Liza");
        customer.addRental(new Rental(new Movie("Balto", "CHILDREN"), 1));

        String expectedResult = "Rental Record for Liza\n" +
                "\tBalto\t1.5\n" +
                "You owed 1.5\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void childrens_3_Day() {
        Customer customer = new Customer("Liza");
        customer.addRental(new Rental(new Movie("Balto", "CHILDREN"), 3));

        String expectedResult = "Rental Record for Liza\n" +
                "\tBalto\t1.5\n" +
                "You owed 1.5\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }

    @Test
    void childrens_10_Day() {
        Customer customer = new Customer("Liza");
        customer.addRental(new Rental(new Movie("Balto", "CHILDREN"), 10));

        String expectedResult = "Rental Record for Liza\n" +
                "\tBalto\t12.0\n" +
                "You owed 12.0\n" +
                "You earned 1 frequent renter points\n";

        Assertions.assertEquals(expectedResult, customer.statement());
    }
}

package students.vitaly_porsev.lesson_15.level_6.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_6.allTasks.*;

public class NewReleaseProcessor implements MovieProcessor {

    @Override
    public boolean canProcess(Rental rental) {
        return rental.getMovie().getPriceCode() == MoviePriceCode.NEW_RELEASE;
    }

    @Override
    public String process(String customer, Rental rental) {
        double totalAmount = rental.getDaysRented() * 3;

        int frequentRenterPoints = 1;

        if (rental.getDaysRented() > 1) {
            frequentRenterPoints++;
        }

        return "Rental Record for " + customer + "\n"
                + "\t" + rental.getMovie().getTitle() + "\t"
                + (totalAmount) + "\n"
                + "You owed " + (totalAmount) + "\n"
                + "You earned " + (frequentRenterPoints) + " frequent renter points\n";
    }
}


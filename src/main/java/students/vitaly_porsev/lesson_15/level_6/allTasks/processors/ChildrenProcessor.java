package students.vitaly_porsev.lesson_15.level_6.allTasks.processors;

import students.vitaly_porsev.lesson_15.level_6.allTasks.MoviePriceCode;
import students.vitaly_porsev.lesson_15.level_6.allTasks.MovieProcessor;
import students.vitaly_porsev.lesson_15.level_6.allTasks.Rental;

public class ChildrenProcessor implements MovieProcessor {

    @Override
    public boolean canProcess(Rental rental) {
        return rental.getMovie().getPriceCode() == MoviePriceCode.CHILDREN;
    }

    @Override
    public String process(String customer, Rental rental) {
        double totalAmount = 1.5;

        int frequentRenterPoints = 1;

        if (rental.getDaysRented() > 3) {
            totalAmount += (rental.getDaysRented() - 3) * 1.5;
        }

        return "Rental Record for " + customer + "\n"
                + "\t" + rental.getMovie().getTitle() + "\t"
                + (totalAmount) + "\n"
                + "You owed " + (totalAmount) + "\n"
                + "You earned " + (frequentRenterPoints) + " frequent renter points\n";
    }
}
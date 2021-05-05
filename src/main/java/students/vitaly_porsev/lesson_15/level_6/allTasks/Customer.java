package students.vitaly_porsev.lesson_15.level_6.allTasks;

import students.vitaly_porsev.lesson_15.level_6.allTasks.processors.ChildrenProcessor;
import students.vitaly_porsev.lesson_15.level_6.allTasks.processors.NewReleaseProcessor;
import students.vitaly_porsev.lesson_15.level_6.allTasks.processors.RegularProcessor;

import java.util.LinkedList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<Rental> rentals = new LinkedList<>();
	private String getName() {
		return name;
	}

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        MovieProcessor[] processors = {new ChildrenProcessor(), new NewReleaseProcessor(), new RegularProcessor()};

        for (Rental rental : rentals) {
            for (MovieProcessor processor : processors)
                if (processor.canProcess(rental)) {
                    return processor.process(getName(), rental);
                }
        }
        return "";
    }
}
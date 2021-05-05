package students.vitaly_porsev.lesson_15.level_6.allTasks;

public class Rental {

	private final Movie movie;
	private final int daysRented;

	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
}
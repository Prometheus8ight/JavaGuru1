package students.vitaly_porsev.lesson_15.level_6.allTasks;

public class Movie {

    private final String title;
    private final MoviePriceCode priceCode;

    public Movie(String title, String priceCode) {
        this.title = title;
        this.priceCode = MoviePriceCode.valueOf(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public MoviePriceCode getPriceCode() {
        return priceCode;
    }
}
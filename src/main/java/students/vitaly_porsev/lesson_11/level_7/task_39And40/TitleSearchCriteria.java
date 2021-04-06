package students.vitaly_porsev.lesson_11.level_7.task_39And40;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return titleToSearch.equals(book.getTitle());
    }
}

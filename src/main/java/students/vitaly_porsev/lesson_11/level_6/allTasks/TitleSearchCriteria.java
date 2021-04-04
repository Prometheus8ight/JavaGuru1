package students.vitaly_porsev.lesson_11.level_6.allTasks;

public class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        return titleToSearch.equals(book.getTitle());
    }
}

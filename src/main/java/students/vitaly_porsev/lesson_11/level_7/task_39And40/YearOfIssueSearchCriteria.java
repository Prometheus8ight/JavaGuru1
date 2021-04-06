package students.vitaly_porsev.lesson_11.level_7.task_39And40;

public class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return yearOfIssueToSearch.equals(book.getYearOfIssue());
    }
}

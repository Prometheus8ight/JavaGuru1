package students.vitaly_porsev.lesson_11.level_4.allTasks;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        return yearOfIssueToSearch.equals(book.getYearOfIssue());
    }
}

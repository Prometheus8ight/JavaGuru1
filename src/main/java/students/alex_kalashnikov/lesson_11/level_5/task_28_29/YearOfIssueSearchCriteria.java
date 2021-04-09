package students.alex_kalashnikov.lesson_11.level_5.task_28_29;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssue;

    public YearOfIssueSearchCriteria(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public boolean match(Book book) {
        return yearOfIssue.equals(book.getYearOfIssue());
    }

}
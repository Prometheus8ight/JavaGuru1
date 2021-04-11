package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

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
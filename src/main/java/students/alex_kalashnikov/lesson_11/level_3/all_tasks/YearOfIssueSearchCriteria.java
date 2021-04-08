package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

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
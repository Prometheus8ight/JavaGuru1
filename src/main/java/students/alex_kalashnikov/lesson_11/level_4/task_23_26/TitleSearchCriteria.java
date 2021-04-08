package students.alex_kalashnikov.lesson_11.level_4.task_23_26;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return titleToSearch.equals(book.getTitle());
    }

}
package students.andrew_galashin.lesson_11.level_3;

class AndSearchCriteria implements SearchCriteria {

    private SearchCriteria left;
    private SearchCriteria right;

    public AndSearchCriteria(SearchCriteria left, SearchCriteria right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean match(Book book) {
        return left.match(book) && right.match(book);
    }
}

package students.deniss_jankovskis.lesson_11.level_3;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        AndSearchCriteria criteria1 = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new TitleSearchCriteria("Zveroboi"));
        AndSearchCriteria criteria2 = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890"));
        OrSearchCriteria criteria3 = new OrSearchCriteria(new AuthorSearchCriteria("Kuper"), new TitleSearchCriteria("Zveroboi"));
        OrSearchCriteria criteria4 = new OrSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890"));
    }
}

package students.julija_katukova.lesson_11.level_3;

class SearchCriteriaDemo {

    public static void main(String[] args) {
        AndSearchCriteria andSearchCriteria1 = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new TitleSearchCriteria("Zveroboi"));
        AndSearchCriteria andSearchCriteria2 = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890"));
        OrSearchCriteria orSearchCriteria1 = new OrSearchCriteria(new AuthorSearchCriteria("Kuper"), new YearOfIssueSearchCriteria("1890"));
        OrSearchCriteria finalOrSearchCriteria = new OrSearchCriteria(orSearchCriteria1, new TitleSearchCriteria("Zveroboi"));
    }

}

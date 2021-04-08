package students.alex_kalashnikov.lesson_11.level_3.all_tasks;

class SearchCriteriaDemo {

    public static void main(String[] args) {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("A2");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("B2");
        SearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria("2000");

        SearchCriteria searchCriteria1 = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria1.match(new Book("A2", "B2", "2000")));
        System.out.println(searchCriteria1.match(new Book("A1", "B2", "2000")));

        SearchCriteria searchCriteria2 = new AndSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println(searchCriteria2.match(new Book("A2", "B1", "2000")));
        System.out.println(searchCriteria2.match(new Book("A2", "B1", "2001")));

        SearchCriteria searchCriteria3 = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria3.match(new Book("A2", "B1", "2005")));
        System.out.println(searchCriteria3.match(new Book("A1", "B1", "2001")));

        SearchCriteria searchCriteria4 = new OrSearchCriteria(authorSearchCriteria, yearOfIssueSearchCriteria);
        System.out.println(searchCriteria4.match(new Book("A1", "B1", "2000")));
        System.out.println(searchCriteria4.match(new Book("A3", "B3", "2005")));

    }

}
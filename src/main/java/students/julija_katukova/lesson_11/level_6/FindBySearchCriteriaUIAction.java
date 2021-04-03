package students.julija_katukova.lesson_11.level_6;

import java.util.Scanner;

class FindBySearchCriteriaUIAction implements UIAction {

    private final BookDatabase bookDatabase;

    public FindBySearchCriteriaUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1, if you would like to find book by its author." + '\n' +
                "Please enter 2, if you would like to find book by its title." + '\n' +
                "Please enter 3, if you would like to find book by its year of issue." + '\n' +
                "Please enter 4, if you would like to find book by its author and its title." + '\n' +
                "Please enter 5, if you would like to find book by its author and its year of issue." + '\n' +
                "Please enter 6, if you would like to find book by its title and its year of issue." + '\n' +
                "Please enter 7, if you would like to find book by its author or its title." + '\n' +
                "Please enter 8, if you would like to find book by its author or its year of issue." + '\n' +
                "Please enter 9, if you would like to find book by its title or its year of issue.");

        int temp = scanner.nextInt();

        switch (temp) {
            case 1:
                System.out.println("Please enter book author: ");
                String author = scanner.nextLine();
                System.out.println(bookDatabase.find(new AuthorSearchCriteria(author)));
                break;
            case 2:
                System.out.println("Please enter book title: ");
                String title = scanner.nextLine();
                System.out.println(bookDatabase.find(new TitleSearchCriteria(title)));
                break;
            case 3:
                System.out.println("Please enter book year of issue: ");
                String yearOfIssue = scanner.nextLine();
                System.out.println(bookDatabase.find(new YearOfIssueSearchCriteria(yearOfIssue)));
                break;
            case 4:
                System.out.println("Please enter book author: ");
                author = scanner.nextLine();
                System.out.println("Please enter book title: ");
                title = scanner.nextLine();
                System.out.println(bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(author), new TitleSearchCriteria(title))));
                break;
            case 5:
                System.out.println("Please enter book author: ");
                author = scanner.nextLine();
                System.out.println("Please enter book year of issue: ");
                yearOfIssue = scanner.nextLine();
                System.out.println(bookDatabase.find(new AndSearchCriteria(new AuthorSearchCriteria(author), new YearOfIssueSearchCriteria(yearOfIssue))));
                break;
            case 6:
                System.out.println("Please enter book title: ");
                title = scanner.nextLine();
                System.out.println("Please enter book year of issue: ");
                yearOfIssue = scanner.nextLine();
                System.out.println(bookDatabase.find(new AndSearchCriteria(new TitleSearchCriteria(title), new YearOfIssueSearchCriteria(yearOfIssue))));
                break;
            case 7:
                System.out.println("Please enter book author: ");
                author = scanner.nextLine();
                System.out.println("Please enter book title: ");
                title = scanner.nextLine();
                System.out.println(bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(author), new TitleSearchCriteria(title))));
                break;
            case 8:
                System.out.println("Please enter book author: ");
                author = scanner.nextLine();
                System.out.println("Please enter book year of issue: ");
                yearOfIssue = scanner.nextLine();
                System.out.println(bookDatabase.find(new OrSearchCriteria(new AuthorSearchCriteria(author), new YearOfIssueSearchCriteria(yearOfIssue))));
                break;
            case 9:
                System.out.println("Please enter book title: ");
                title = scanner.nextLine();
                System.out.println("Please enter book year of issue: ");
                yearOfIssue = scanner.nextLine();
                System.out.println(bookDatabase.find(new OrSearchCriteria(new TitleSearchCriteria(title), new YearOfIssueSearchCriteria(yearOfIssue))));
                break;
        }
    }
}
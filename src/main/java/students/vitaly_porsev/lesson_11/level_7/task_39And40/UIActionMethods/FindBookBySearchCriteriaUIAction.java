package students.vitaly_porsev.lesson_11.level_7.task_39And40.UIActionMethods;

import students.vitaly_porsev.lesson_11.level_7.task_39And40.*;

import java.util.Scanner;

public class FindBookBySearchCriteriaUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindBookBySearchCriteriaUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }


    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Which criteria you want to choose?
                1. Title and Author?
                2. Title and Year?
                3. Author and Year?
                4. Title or Author?
                5. Title or Year?
                6. Author or Year?"""
        );
        chooseCriteria(scanner.nextInt());

    }

    private void chooseCriteria(int answer) {
        Scanner scanner = new Scanner(System.in);
        String one;
        String two;
        switch (answer) {
            case 1 -> {
                System.out.println("Please enter title: ");
                one = scanner.nextLine();
                System.out.println("Please enter author: ");
                two = scanner.nextLine();
                System.out.println(bookDatabase.findByCriteria(new AndSearchCriteria(new TitleSearchCriteria(one), new AuthorSearchCriteria(two))));
            }

            case 2 -> {
                System.out.println("Please enter title: ");
                one = scanner.nextLine();
                System.out.println("Please enter year: ");
                two = scanner.nextLine();
                System.out.println(bookDatabase.findByCriteria(new AndSearchCriteria(new TitleSearchCriteria(one), new YearOfIssueSearchCriteria(two))));
            }

            case 3 -> {
                System.out.println("Please enter author: ");
                one = scanner.nextLine();
                System.out.println("Please enter year: ");
                two = scanner.nextLine();
                System.out.println(bookDatabase.findByCriteria(new AndSearchCriteria(new AuthorSearchCriteria(one), new YearOfIssueSearchCriteria(two))));
            }

            case 4 -> {
                System.out.println("Please enter title: ");
                one = scanner.nextLine();
                System.out.println("Please enter author: ");
                two = scanner.nextLine();
                System.out.println(bookDatabase.findByCriteria(new OrSearchCriteria(new TitleSearchCriteria(one), new AuthorSearchCriteria(two))));
            }

            case 5 -> {
                System.out.println("Please enter title: ");
                one = scanner.nextLine();
                System.out.println("Please enter year: ");
                two = scanner.nextLine();
                System.out.println(bookDatabase.findByCriteria(new OrSearchCriteria(new TitleSearchCriteria(one), new YearOfIssueSearchCriteria(two))));
            }

            case 6 -> {
                System.out.println("Please enter author: ");
                one = scanner.nextLine();
                System.out.println("Please enter year: ");
                two = scanner.nextLine();
                System.out.println(bookDatabase.findByCriteria(new OrSearchCriteria(new AuthorSearchCriteria(one), new YearOfIssueSearchCriteria(two))));
            }
        }
    }
}

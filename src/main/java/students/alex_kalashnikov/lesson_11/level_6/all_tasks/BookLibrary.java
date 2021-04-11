package students.alex_kalashnikov.lesson_11.level_6.all_tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BookLibrary {

    private Map<Integer, UIAction> menuNumberToActionMap;

    public BookLibrary() {
        BookDatabase bookDatabase = new BookDatabaseImpl();
        menuNumberToActionMap = new HashMap();
        menuNumberToActionMap.put(1, new SaveBookUIAction(bookDatabase));
        menuNumberToActionMap.put(2, new FindByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(3, new FindByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(4, new FindByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(5, new DeleteByIdUIAction(bookDatabase));
        menuNumberToActionMap.put(6, new DeleteByBookUIAction(bookDatabase));
        menuNumberToActionMap.put(7, new DeleteByAuthorUIAction(bookDatabase));
        menuNumberToActionMap.put(8, new DeleteByTitleUIAction(bookDatabase));
        menuNumberToActionMap.put(9, new CountAllBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(10, new FindUniqueAuthorsUIAction(bookDatabase));
        menuNumberToActionMap.put(11, new FindUniqueTitlesUIAction(bookDatabase));
        menuNumberToActionMap.put(12, new FindUniqueBooksUIAction(bookDatabase));
        menuNumberToActionMap.put(13, new ContainsIUAction(bookDatabase));
        menuNumberToActionMap.put(14, new GetAuthorToBooksMapUIAction(bookDatabase));
        menuNumberToActionMap.put(15, new GetEachAuthorBookCountUIAction(bookDatabase));
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("MENU:");
            System.out.println("0 - EXIT PROGRAM");
            System.out.println("1 - SAVE NEW BOOK");
            System.out.println("2 - FIND BOOK BY ID");
            System.out.println("3 - FIND BOOKS BY AUTHOR");
            System.out.println("4 - FIND BOOKS BY TITLE");
            System.out.println("5 - DELETE BOOK BY ID");
            System.out.println("6 - DELETE BOOKS BY AUTHOR AND TITLE");
            System.out.println("7 - DELETE BOOKS BY AUTHOR");
            System.out.println("8 - DELETE BOOKS BY TITLE");
            System.out.println("9 - NUMBER OF BOOKS IN THE LIBRARY");
            System.out.println("10 - AUTHORS IN THE LIBRARY");
            System.out.println("11 - TITLES IN THE LIBRARY");
            System.out.println("12 - BOOKS IN THE LIBRARY");
            System.out.println("13 - CHECK IF BOOK AVAILABLE");
            System.out.println("14 - ALL UNIQUE BOOKS BY AUTHORS");
            System.out.println("15 - NUMBER OF UNIQUE BOOKS OF EACH AUTHORS");

            System.out.println("Please enter menu number: ");
            int userSelectedMenuNumber = Integer.parseInt(sc.nextLine());
            if (userSelectedMenuNumber == 0) {
                System.out.println("Thank you! Good by!");
                break;
            } else {
                executeUIAction(userSelectedMenuNumber);
            }
        }
    }


    private void executeUIAction(int userSelectedMenuNumber) {
        UIAction uiAction = menuNumberToActionMap.get(userSelectedMenuNumber);
        if (uiAction != null) {
            uiAction.execute();
        } else {
            System.out.println("Menu item not exist: " + userSelectedMenuNumber);
        }
    }

}
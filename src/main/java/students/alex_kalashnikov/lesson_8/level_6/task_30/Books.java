package students.alex_kalashnikov.lesson_8.level_6.task_30;

import java.util.Arrays;

class Books {

    public static void main(String[] args) {

        String book1 = "book1";
        String book2 = "book2";
        String book3 = "book3";
        String book4 = "book4";
        String book5 = "book5";
        String book6 = "book6";
        String book7 = "book7";
        String book8 = "book8";
        String book9 = "book9";
        String book10 = "book10";

        String[] threeBooksArr = choose(book1, book2, book3); // три переменные - три строки в массив
        System.out.println(Arrays.toString(threeBooksArr));

        String[] fiveBooksArr = choose(book1, book5, book6, book10, book2); // пять переменных - пять строк в массив
        System.out.println(Arrays.toString(fiveBooksArr));

        String[] oneBookArr = choose(book7);
        System.out.println(Arrays.toString(oneBookArr)); // одна переменная - одна строка в массив

    }

    static String[] choose(String... a) { // добавляет строку в массив
        return a;
    }

}
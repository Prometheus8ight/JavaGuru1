package students.alex_kalashnikov.lesson_10.level_7.task_27;

class NodeDemo {

    public static void main(String[] args) {

        Node node = new Node();
        node.add(new Book("1", "1"));
        node.add(new Book("2", "2"));
        node.add(new Book("3", "3"));
        node.add(new Book("4", "4"));
        node.add(new Book("5", "5"));
        node.add(new Book("6", "6"));
        node.add(new Book("7", "7"));
        node.add(new Book("8", "8"));
        node.add(new Book("9", "9"));
        node.add(new Book("10", "10"));
        node.add(new Book("11", "11"));
        node.add(new Book("12", "12"));
        node.addAfter(new Book("6.5", "6.5"), new Book("6", "6")); // добавление новой книги после книги [G;G]
        node.addAfter(new Book("6.75", "6.75"), new Book("6.5", "6.5"));
        node.add(new Book("13", "13"));

        System.out.println("Find book [1;1]: " + node.find(new Book("1", "1"))); // поиск книги
        System.out.println("Find book [13;13]: " + node.find(new Book("13", "13")));
        System.out.println("Find book [25;13]: " + node.find(new Book("25", "13"))); // нет в репозитории
        System.out.println("Find book [6.5;6.5]: " + node.find(new Book("6.5", "6.5")));
        System.out.println("Find book [6.75;6.75]: " + node.find(new Book("6.75", "6.75")));

        node.delete(new Book("6", "6"));

        System.out.println("Find book [6;6]: " + node.find(new Book("6", "6"))); // поиск ранее удаленной книги
        System.out.println("Find book [2;2]: " + node.find(new Book("2", "2")));

        System.out.println("Find book linked previous to [2;2]: " + node.findNode(new Book("2", "2")).getPrevious().getBook()); // поиск связанных с [B;B] книг
        System.out.println("Find book linked next to [2;2]: " + node.findNode(new Book("2", "2")).getNext().getBook());

        System.out.println("Find book linked previous to [6.75;6.75]: " + node.findNode(new Book("6.75", "6.75")).getPrevious().getBook());
        System.out.println("Find book linked next to [6.75;6.75]: " + node.findNode(new Book("6.75", "6.75")).getNext().getBook());

        node.delete(new Book("6.5", "6.5"));

        System.out.println("Find book linked previous to [6.75;6.75]: " + node.findNode(new Book("6.75", "6.75")).getPrevious().getBook());
        System.out.println("Find book linked next to [6.75;6.75]: " + node.findNode(new Book("6.75", "6.75")).getNext().getBook());

    }

}
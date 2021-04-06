package students.alex_kalashnikov.lesson_10.level_7.task_27;

class NodeDemo {

    public static void main(String[] args) {

        Node node = new Node();
        node.add(new Book("A", "A"));
        node.add(new Book("B", "B"));
        node.add(new Book("C", "C"));
        node.add(new Book("D", "D"));
        node.add(new Book("E", "A"));
        node.add(new Book("F", "F"));
        node.add(new Book("G", "G"));
        node.add(new Book("H", "H"));
        node.add(new Book("I", "I"));
        node.add(new Book("J", "J"));
        node.add(new Book("K", "K"));
        node.add(new Book("L", "L"));

        node.addAfter(new Book("GH", "GH"), new Book("G", "G"));

        node.add(new Book("M", "M"));

        node.delete(new Book("GH", "GH"));

        node.addAfter(new Book("GHH", "GHH"), new Book("G", "G"));

        System.out.println(node.getCurrent().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getBook());

        System.out.println(node.find(new Book("GHH", "GHH")));

    }

}
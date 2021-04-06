package students.alex_kalashnikov.lesson_10.level_7.task_27;

class NodeDemo {

    public static void main(String[] args) {

        Node node = new Node();
        node.add(new Book("A", "A"));
        node.add(new Book("B", "B"));
        node.add(new Book("C", "C"));
        node.add(new Book("D", "D"));
        node.add(new Book("E", "E"));
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

//        node.editNextLink(new Book("F", "F"), new Book("H", "H"));
//        node.delete(new Book("G", "G"));

////
//        System.out.println(node.getCurrent().getPrevious().getPrevious().getBook());

//        Node node1 = new Node(new Book("1", "1"));
//        node1.setPrevious(null);
//        node1.setNext(null);
//        Node node2 = new Node(new Book("2", "2"));
//        node1.setNext(node2);
//        node2.setPrevious(node1);
//        node2.setNext(null);
//        Node node3 = new Node(new Book("3", "3"));
//        node2.setNext(node3);
//        node3.setPrevious(node2);
//        node3.setNext(null);
//        Node node4 = new Node(new Book("4", "4"));
//        node3.setNext(node4);
//        node4.setPrevious(node3);
//        node4.setNext(null);
//
        System.out.println(node.getCurrent().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getPrevious().getNext().getPrevious().getBook());
//
        System.out.println(node.find(new Book("X", "C")));
//        Node nodeX = node.findNode(new Book("CD", "CD"));
//        System.out.println(nodeX.getNext().getNext().getPrevious().getBook());


    }




}
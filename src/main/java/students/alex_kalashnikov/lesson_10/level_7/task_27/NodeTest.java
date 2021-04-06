package students.alex_kalashnikov.lesson_10.level_7.task_27;

public class NodeTest {

    public static void main(String[] args) {

        NodeTest victim = new NodeTest();
        victim.testAdd();

    }

    void test(Node expectedResult, Node realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
        }
        else {
            System.out.println("Test is FAILED!");
        }
    }

    void testAdd() {
        Node node1 = new Node(new Book("A", "A"), null, null);
        Node node2 = new Node(new Book("B", "B"), null, node1);
//        Node node3 = new Node(new Book("C", "C"), null, node2);
//        Node node4 = new Node(new Book("D", "D"), null, node3);
//        Node node5 = new Node(new Book("E", "E"), null, node4);
//        Node node6 = new Node(new Book("F", "F"), null, node5);
//        Node node7 = new Node(new Book("G", "G"), null, node6);
//        Node node8 = new Node(new Book("H", "H"), null, node7);
//        Node node9 = new Node(new Book("I", "I"), null, node8);
//        Node node10 = new Node(new Book("J", "J"), null, node9);
//        Node node11 = new Node(new Book("K", "K"), null, node10);


        Node victim = new Node();
        victim.add(new Book("A", "A"));
        victim.add(new Book("B", "B"));
//        victim.add(new Book("C", "C"));
//        victim.add(new Book("D", "D"));
//        victim.add(new Book("E", "E"));
//        victim.add(new Book("F", "F"));
//        victim.add(new Book("G", "G"));
//        victim.add(new Book("H", "H"));
//        victim.add(new Book("I", "I"));
//        victim.add(new Book("J", "J"));
//        victim.add(new Book("K", "K"));
//        victim = victim.getLast();
        test(node2, victim.getCurrent());
        System.out.println("EXPE: " + node2);
        System.out.println("REAL: " + victim.getCurrent().getPrevious());
    }

}

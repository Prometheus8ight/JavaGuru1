package students.alex_kalashnikov.lesson_10.level_7.task_27;

class NodeTest {

    public static void main(String[] args) {

        NodeTest newTest = new NodeTest();
        newTest.testFind();
        newTest.testFind1();
        newTest.testFind2();
        newTest.testFind3();
        newTest.testFind4();
        newTest.testFind5();
        newTest.testFind6();
        newTest.testLinkPrevious();
        newTest.testLinkPrevious1();
        newTest.testLinkPrevious2();
        newTest.testLinkPrevious3();
        newTest.testLinkNext();
        newTest.testLinkNext1();
        newTest.testLinkNext2();
        newTest.testLinkNext3();

    }

    void test(Book expectedResult, Book realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testNull(Book realResult) {
        if (null == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testNull1(Node realResult) {
        if (null == realResult) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    Node create() {
        Node victim = new Node();
        victim.add(new Book("1", "1"));
        victim.add(new Book("2", "2"));
        victim.add(new Book("3", "3"));
        victim.add(new Book("4", "4"));
        victim.add(new Book("5", "5"));
        victim.add(new Book("6", "6"));
        victim.add(new Book("7", "7"));
        victim.add(new Book("8", "8"));
        victim.add(new Book("9", "9"));
        victim.add(new Book("10", "10"));
        victim.add(new Book("11", "11"));
        victim.add(new Book("12", "12"));
        victim.addAfter(new Book("6.5", "6.5"), new Book("6", "6")); // добавление новой книги после книги [6;6]
        victim.addAfter(new Book("6.75", "6.75"), new Book("6.5", "6.5"));
        victim.delete(new Book("6", "6"));
        return victim;
    }

    void testFind() {
        Node victim = create();
        Book expectedResult = new Book("12", "12");
        System.out.print("Find book: ");
        test(expectedResult, victim.find(new Book("12", "12")));
    }

    void testFind1() {
        Node victim = create();
        Book expectedResult = new Book("1", "1");
        System.out.print("Find book: ");
        test(expectedResult, victim.find(new Book("1", "1")));
    }

    void testFind2() {
        Node victim = create();
        Book expectedResult = new Book("7", "7");
        System.out.print("Find book: ");
        test(expectedResult, victim.find(new Book("7", "7")));
    }

    void testFind3() {
        Node victim = create();
        Book expectedResult = new Book("6.5", "6.5");
        System.out.print("Find book: ");
        test(expectedResult, victim.find(new Book("6.5", "6.5")));
    }

    void testFind4() {
        Node victim = create();
        Book expectedResult = new Book("6.75", "6.75");
        System.out.print("Find book: ");
        test(expectedResult, victim.find(new Book("6.75", "6.75")));
    }

    void testFind5() {
        Node victim = create();
        System.out.print("Find book: ");
        testNull(victim.find(new Book("25", "25")));
    }

    void testFind6() {
        Node victim = create();
        System.out.print("Find book: ");
        testNull(victim.find(new Book("6", "6")));
    }

    void testLinkPrevious() {
        Node victim = create();
        System.out.print("Find linked book: ");
        testNull1(victim.findNode(new Book ("1", "1")).getPrevious());
    }

    void testLinkPrevious1() {
        Node victim = create();
        Book expectedResult = new Book("11", "11");
        System.out.print("Find linked book: ");
        test(expectedResult, victim.findNode(new Book("12", "12")).getPrevious().getBook());
    }

    void testLinkPrevious2() {
        Node victim = create();
        Book expectedResult = new Book("6.75", "6.75");
        System.out.print("Find linked book: ");
        test(expectedResult, victim.findNode(new Book("7", "7")).getPrevious().getBook());
    }

    void testLinkPrevious3() {
        Node victim = create();
        System.out.print("Find linked book: ");
        testNull(victim.findNode(new Book("6", "6")).getPrevious().getBook());
    }

    void testLinkNext() {
        Node victim = create();
        System.out.print("Find linked book: ");
        testNull1(victim.findNode(new Book ("12", "12")).getNext());
    }

    void testLinkNext1() {
        Node victim = create();
        Book expectedResult = new Book("2", "2");
        System.out.print("Find linked book: ");
        test(expectedResult, victim.findNode(new Book("1", "1")).getNext().getBook());
    }

    void testLinkNext2() {
        Node victim = create();
        Book expectedResult = new Book("6.75", "6.75");
        System.out.print("Find linked book: ");
        test(expectedResult, victim.findNode(new Book("6.5", "6.5")).getNext().getBook());
    }

    void testLinkNext3() {
        Node victim = create();
        Book expectedResult = new Book("6.5", "6.5");
        System.out.print("Find linked book: ");
        test(expectedResult, victim.findNode(new Book("5", "5")).getNext().getBook());
    }

}
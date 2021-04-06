package students.alex_kalashnikov.lesson_10.level_7.task_27;

class Node {

    private Book book;
    private Node current;
    private Node next;
    private Node previous;
    private Node last;
    static int counter;

    public Book getBook() {
        return book;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getCurrent() {
        return current;
    }

    public Node() {
    }

    public Node(Book book) {
        this.book = book;
    }

    void add(Book book) {
        if (counter == 0) {
            current = new Node(book);
            last = current;
            counter++;
        } else if (!checkName(book)) {
            current = new Node(book);
            last.next = current;
            current.previous = last;
            last = current;
            counter++;
        } else {
            System.out.println("Book with this name already exists!");
        }
    }

    void addAfter(Book book, Book after) {
        Node node = new Node(book);
        node.setPrevious(findNode(after));
        node.setNext(findNode(after).getNext());
        findNode(after).getNext().setPrevious(node);
        findNode(after).setNext(node);
    }

    void delete(Book book) {
        findNode(book).getPrevious().setNext(findNode(book).getNext());
        findNode(book).getNext().setPrevious(findNode(book).getPrevious());
    }

    Book find(Book book) {
        Node nodeX = current;
        Node nodeY = current;
        while (nodeX != null) {
            if (nodeX.getBook().equals(book)) {
                return book;
            } else {
                nodeX = nodeX.getPrevious();
            }
        }
        while (nodeY != null) {
            if (nodeY.getBook().equals(book)) {
                return book;
            } else {
                nodeY = nodeY.getNext();
            }
        }
        return null;
    }

    boolean checkName(Book book) {
        Node nodeX = current;
        Node nodeY = current;
        while (nodeX != null) {
            if (nodeX.getBook().getName().equals(book.getName())) {
                return true;
            } else {
                nodeX = nodeX.getPrevious();
            }
        }
        while (nodeY != null) {
            if (nodeY.getBook().getName().equals(book.getName())) {
                return false;
            } else {
                nodeY = nodeY.getNext();
            }
        }
        return false;
    }

    Node findNode(Book book) {
        Node nodeX = current;
        Node nodeY = current;
        while (nodeX != null) {
            if (nodeX.getBook().equals(book)) {
                return nodeX;
            } else {
                nodeX = nodeX.getPrevious();
            }
        }
        while (nodeY != null) {
            if (nodeY.getBook().equals(book)) {
                return nodeY;
            } else {
                nodeY = nodeY.getNext();
            }
        }
        return null;
    }


}
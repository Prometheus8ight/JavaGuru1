package students.alex_kalashnikov.lesson_10.level_7.task_27;


import java.util.Objects;

class Node implements LinkedRepository {

    private Book book;
    private Node current;
    private Node next;
    private Node previous;
    private Node last;
    private int counter;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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

    public Node getLast() {
        return last;
    }

    public Node() {
    }

    public Node(Book book) {
        this.book = book;
    }

    public Node(Book book, Node next, Node previous) {
        this.book = book;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(book, node.book) && Objects.equals(next, node.next) && Objects.equals(previous, node.previous);
    }

    @Override
    public String toString() {
        return "Node{" +
                "book=" + book +
                ", next=" + next +
                ", previous=" + previous +
                '}';
    }

    @Override
    public void add(Book book) {
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

    @Override
    public void addAfter(Book book, Book after) {
        if (!checkName(book) && checkName(after)) {
            Node node = new Node(book);
            node.setPrevious(findNode(after));
            node.setNext(findNode(after).getNext());
            findNode(after).getNext().setPrevious(node);
            findNode(after).setNext(node);
        } else {
            System.out.println("Wrong data");
        }
    }

    @Override
    public void delete(Book book) {
        if (checkName(book)) {
            findNode(book).getPrevious().setNext(findNode(book).getNext());
            findNode(book).getNext().setPrevious(findNode(book).getPrevious());
        } else {
            System.out.println("Wrong data!");
        }
    }

    @Override
    public Book find(Book book) {
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

    private boolean checkName(Book book) {
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
        return new Node(null, new Node(null, null, null), new Node(null, null, null));
    }

}
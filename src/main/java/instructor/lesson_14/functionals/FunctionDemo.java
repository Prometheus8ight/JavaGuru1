package instructor.lesson_14.functionals;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {

        SquareFunction function = new SquareFunction();
        System.out.println("function.apply(5) = " + function.apply(5));

        StringToIntegerFunction f2 = new StringToIntegerFunction();
        Integer integer = f2.apply("12345");
        System.out.println("integer = " + integer);

        BookToAuthorFunction f3 = new BookToAuthorFunction();
        System.out.println(f3.apply(new Book("123", "Foobar")));

    }
}

class SquareFunction implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer x) {
        return x * x;
    }
}

class StringToIntegerFunction implements Function<String, Integer> {

    @Override
    public Integer apply(String s) {
        return Integer.parseInt(s);
    }
}

class BookToAuthorFunction implements Function<Book, String> {

    @Override
    public String apply(Book book) {
        return book.author;
    }
}

class Book {

    String id;
    String author;

    public Book(String id, String author) {
        this.id = id;
        this.author = author;
    }
}

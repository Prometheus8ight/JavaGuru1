package students.julija_katukova.lesson_12.level_1.task_5;

import java.util.InputMismatchException;

class ExceptionDemo extends Exception {

    boolean enableSuppression;
    boolean writableStackTrace;

    ExceptionDemo exception1 = new ExceptionDemo();
    ExceptionDemo exception2 = new ExceptionDemo("error");
    ExceptionDemo exception3 = new ExceptionDemo("error", new InputMismatchException());
    ExceptionDemo exception4 = new ExceptionDemo(new InputMismatchException());
    ExceptionDemo exception5 = new ExceptionDemo("error", new InputMismatchException(), enableSuppression, writableStackTrace);

    ExceptionDemo() {
        super();
    }

    public ExceptionDemo(String message) {
        super(message);
    }

    public ExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDemo(Throwable cause) {
        super(cause);
    }

    public ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}



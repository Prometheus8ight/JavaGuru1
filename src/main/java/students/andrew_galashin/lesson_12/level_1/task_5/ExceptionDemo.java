package students.andrew_galashin.lesson_12.level_1.task_5;

import java.util.InputMismatchException;

class ExceptionDemo extends Exception {


    boolean enableSuppression;
    boolean writableStackTrace;

    ExceptionDemo exceptionDemo1 = new ExceptionDemo();
    ExceptionDemo exceptionDemo2 = new ExceptionDemo("fail");
    ExceptionDemo exceptionDemo3 = new ExceptionDemo("fail", new InputMismatchException(), enableSuppression, writableStackTrace);

    public ExceptionDemo() {
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

package instructor.lesson_12;

public class RuntimeExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Before");

        System.out.println(100 / 0);

//        int[] array = new int[10];
//        System.out.println(array[15]);

//        String str = null;
//        foo(str);

        System.out.println("After");

    }

    public static void foo(String str) {
        System.out.println(str.toUpperCase());
    }
}

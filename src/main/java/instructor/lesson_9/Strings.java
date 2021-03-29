package instructor.lesson_9;

class Strings {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";

        if (s1 == s2) {
            System.out.println("a");
        }

        if (s1.equals(s2)) {
            System.out.println("b");
        }

        if (s1 == s3) {
            System.out.println("c");
        }

    }
}

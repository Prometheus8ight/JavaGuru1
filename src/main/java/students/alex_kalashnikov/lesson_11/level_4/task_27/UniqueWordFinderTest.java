package students.alex_kalashnikov.lesson_11.level_4.task_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {

    public static void main(String[] args) {

        UniqueWordFinderTest newTest = new UniqueWordFinderTest();
        newTest.testUniqueWordFinder1();
        newTest.testUniqueWordFinder2();
        newTest.testUniqueWordFinder3();
        newTest.testUniqueWordFinder4();
        newTest.testUniqueWordFinder5();

    }

    void test(Set<String> expectedResult, Set<String> realResult) {
        if (Arrays.equals(expectedResult.toArray(), realResult.toArray())) {
            System.out.println("Test is OK!");
        } else {
            System.out.println("Test is FAILED!");
        }
    }

    void testUniqueWordFinder1() {
        UniqueWordFinder victim = new UniqueWordFinder();
        String text = "Java, Python, javaScript, Java";
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("java");
        expectedResult.add("python");
        expectedResult.add("javascript");
        test(expectedResult, victim.find(text));
    }

    void testUniqueWordFinder2() {
        UniqueWordFinder victim = new UniqueWordFinder();
        String text = "Java, Python; javaScript! Java - java.";
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("java");
        expectedResult.add("python");
        expectedResult.add("javascript");
        test(expectedResult, victim.find(text));
    }

    void testUniqueWordFinder3() {
        UniqueWordFinder victim = new UniqueWordFinder();
        String text = "Java, PyTHon; javaScript! Java   JAVA. python";
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("java");
        expectedResult.add("python");
        expectedResult.add("javascript");
        test(expectedResult, victim.find(text));
    }

    void testUniqueWordFinder4() {
        UniqueWordFinder victim = new UniqueWordFinder();
        String text = "";
        Set<String> expectedResult = new HashSet<>();
        test(expectedResult, victim.find(text));
    }

    void testUniqueWordFinder5() {
        UniqueWordFinder victim = new UniqueWordFinder();
        String text = "Java, PyTHon; javaScript! Java   JAVA. python!!! Pascal, BASIC.";
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("java");
        expectedResult.add("python");
        expectedResult.add("javascript");
        expectedResult.add("pascal");
        expectedResult.add("basic");
        test(expectedResult, victim.find(text));
    }

}
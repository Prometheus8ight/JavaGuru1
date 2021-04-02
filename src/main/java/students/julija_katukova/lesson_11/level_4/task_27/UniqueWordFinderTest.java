package students.julija_katukova.lesson_11.level_4.task_27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest uniqueWordFinderTest = new UniqueWordFinderTest();
        uniqueWordFinderTest.test1();
        uniqueWordFinderTest.test2();
    }

    private void test1() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "The king is dead, long live the king!";
        Set<String> realResult = uniqueWordFinder.find(text);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("the");
        expectedResult.add("king");
        expectedResult.add("is");
        expectedResult.add("dead");
        expectedResult.add("long");
        expectedResult.add("live");
        check(realResult, expectedResult, "Test1");
    }

    private void test2() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "That that is is that that is not is not. Is that it? It is.";
        Set<String> realResult = uniqueWordFinder.find(text);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("that");
        expectedResult.add("is");
        expectedResult.add("not");
        expectedResult.add("it");
        check(realResult, expectedResult, "Test2");
    }

    private void check(Set<String> realResult, Set<String> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

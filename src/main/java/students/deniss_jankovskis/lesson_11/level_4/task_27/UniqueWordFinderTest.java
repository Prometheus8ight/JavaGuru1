package students.deniss_jankovskis.lesson_11.level_4.task_27;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {

    public static void main(String[] args) {

        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.uniqueWordFinderTest1();
        test.uniqueWordFinderTest2();
        test.uniqueWordFinderTest3();
    }

    public void uniqueWordFinderTest1() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "This is the malt that lay in the house that Jack built.";
        Set<String> realResult = uniqueWordFinder.find(text);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("the");
        expectedResult.add("that");
        expectedResult.add("lay");
        expectedResult.add("in");
        expectedResult.add("built");
        expectedResult.add("is");
        expectedResult.add("house");
        expectedResult.add("jack");
        expectedResult.add("malt");
        checkTestResult(realResult, expectedResult, "Find Unique Word Test 1");
    }

    public void uniqueWordFinderTest2() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "It's okay not to be okay";
        Set<String> realResult = uniqueWordFinder.find(text);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("okay");
        expectedResult.add("not");
        expectedResult.add("be");
        expectedResult.add("to");
        checkTestResult(realResult, expectedResult, "Find Unique Word Test 2");
    }

    public void uniqueWordFinderTest3() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "And miles to go before I sleep, and miles to go before I sleep.";
        Set<String> realResult = uniqueWordFinder.find(text);
        Set<String> expectedResult = new HashSet<>();
        expectedResult.add("before");
        expectedResult.add("go");
        expectedResult.add("i");
        expectedResult.add("miles");
        expectedResult.add("sleep");
        expectedResult.add("and");
        expectedResult.add("to");
        checkTestResult(realResult, expectedResult, "Find Unique Word Test 3");
    }

    public void checkTestResult(Set<String> realResult, Set<String> expectedResult, String testName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FALSE");
        }
    }
}

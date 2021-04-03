package students.vitaly_porsev.lesson_11.level_4.allTasks;

import java.util.HashSet;
import java.util.Set;

public class TestFindUniqueWords {
    public static void main(String[] args) {
        TestFindUniqueWords method = new TestFindUniqueWords();
        method.findUniqueWordsTest();
    }

    void findUniqueWordsTest(){
        UniqueWordFinder method = new UniqueWordFinder();

        String text = "The intellectual content in a physical book need not be a composition, nor even be called a book.";
        Set<String> newSet = new HashSet<>();
        newSet.add("a"); newSet.add("be"); newSet.add("called"); newSet.add("in");
        newSet.add("need"); newSet.add("book"); newSet.add("intellectual"); newSet.add("content");
        newSet.add("the"); newSet.add("nor"); newSet.add("not"); newSet.add("composition");
        newSet.add("even"); newSet.add("physical");

        checkStrings(newSet, method.findUniqueWords(text),"findUniqueWordsTest");
    }

    private void checkStrings(Set<String> expectedResult, Set<String> realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}

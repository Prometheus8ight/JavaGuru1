package students.deniss_jankovskis.lesson_7.task_11;


public class PalindromeTest {

    public static void main(String[] args) {

        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTest1();
        test.isPalindromeTest2();
        test.isPalindromeTest3();
        test.isPalindromeTest4();
        test.isPalindromeTest5();
        test.isPalindromeTest6();
    }

    private void isPalindromeTest1() {
        Palindrome palindrome = new Palindrome();
        String text = "Madam";
        checkTrueTest(palindrome.isPalindrome(text), "madamTest");
    }

    private void isPalindromeTest2() {
        Palindrome palindrome = new Palindrome();
        String text = "tenet";
        checkTrueTest(palindrome.isPalindrome(text), "tenetTest");
    }

    private void isPalindromeTest3() {
        Palindrome palindrome = new Palindrome();
        String text = "My gym";
        checkTrueTest(palindrome.isPalindrome(text), "gymTest");
    }

    private void isPalindromeTest4() {
        Palindrome palindrome = new Palindrome();
        String text = "Was it a cat I saw";
        checkTrueTest(palindrome.isPalindrome(text), "catTest");
    }

    private void isPalindromeTest5() {
        Palindrome palindrome = new Palindrome();
        String text = "Hello World";
        checkFalseTest(palindrome.isPalindrome(text), "helloWorldTest");
    }

    private void isPalindromeTest6() {
        Palindrome palindrome = new Palindrome();
        String text = "How are you?";
        checkFalseTest(palindrome.isPalindrome(text), "howAreYouTest");
    }



    private void checkTrueTest(boolean trueOrFalse, String testName) {
        if (trueOrFalse) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

    public void checkFalseTest(boolean trueOrFalse, String testName) {
        if (!trueOrFalse) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}

package students.vitaly_porsev.lesson_7.level_6.task_11;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest method = new PalindromeTest();
        method.levelTest();
        method.azorTest();
        method.falseTest();
    }

    void levelTest() {
        Palindrome method = new Palindrome();
        String test = "level";
        checkTrue(method.isPalindrome(test), "levelTest");
    }

    void azorTest() {
        Palindrome method = new Palindrome();
        String test = "А роза упала на лапу Азора";
        checkTrue(method.isPalindrome(test), "azorTest");
    }

    void falseTest() {
        Palindrome method = new Palindrome();
        String test = "Java";
        checkFalse(method.isPalindrome(test), "falseTest");
    }

    void checkTrue(boolean trueOrNot, String testName) {
        if (trueOrNot) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }

    void checkFalse(boolean trueOrNot, String testName) {
        if (!trueOrNot) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FALSE");
        }
    }
}
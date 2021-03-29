package students.julija_katukova.lesson_7.level_6.task_11;

class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.text1("racecar");
        palindromeTest.text2("А роза упала на лапу Азора");
        palindromeTest.text3("LeVEla");
        palindromeTest.text4("А роза упала на морду Азора");
    }

    public void text1(String text) {
        Palindrome palindrome = new Palindrome();
        boolean realResult = palindrome.isPalindrome(text);
        check(realResult, true, "Text Test1");
    }

    public void text2(String text) {
        Palindrome palindrome = new Palindrome();
        boolean realResult = palindrome.isPalindrome(text);
        check(realResult, true, "Text Test2");
    }

    public void text3(String text) {
        Palindrome palindrome = new Palindrome();
        boolean realResult = palindrome.isPalindrome(text);
        check(realResult, false, "Text Test3");
    }

    public void text4(String text) {
        Palindrome palindrome = new Palindrome();
        boolean realResult = palindrome.isPalindrome(text);
        check(realResult, false, "Text Test4");
    }

    public void check(boolean realResult, boolean expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}

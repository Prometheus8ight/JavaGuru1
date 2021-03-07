package students.rodion_afanasjev.lesson_7.level_6.task_11;

class PalindromeTest {

    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        String text = "LEvel";
        boolean pali = palindrome.isPalindrome(text);
        System.out.println(pali);

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTrueTest();
        palindromeTest.isPalindromeTrueTest2();
        palindromeTest.isPalindromeFalseTest();

    }

    void isPalindromeTrueTest(){
        Palindrome palindrome = new Palindrome();
        String text = "racecar";
        boolean realResult = palindrome.isPalindrome(text);
        equalCheck(realResult,"isPalindromeTrueTest");
    }

    void isPalindromeTrueTest2(){
        Palindrome palindrome = new Palindrome();
        String text = "RAcecar";
        boolean realResult = palindrome.isPalindrome(text);
        equalCheck(realResult,"isPalindromeTrueTest2");
    }

    void isPalindromeFalseTest(){
        Palindrome palindrome = new Palindrome();
        String text = "qwerty";
        boolean realResult = palindrome.isPalindrome(text);
        equalCheck(!realResult,"isPalindromeFalseTest");
    }

    void equalCheck(boolean realResult,String testName){
        if (realResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}

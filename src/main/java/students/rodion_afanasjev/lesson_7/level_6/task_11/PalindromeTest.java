package students.rodion_afanasjev.lesson_7.level_6.task_11;

class PalindromeTest {

    public static void main(String[] args) {

        Palindrome palindrome = new Palindrome();
        String text = "а роза упала на лапу азора";
        boolean pali = palindrome.palindrome(text);
        System.out.println(pali);

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.isPalindromeTrueTest();
        palindromeTest.isPalindromeTrueTest2();
        palindromeTest.isPalindromeFalseTest();
        palindromeTest.isPalindromeTest1();
        palindromeTest.isPalindromeTest2();

    }

    void isPalindromeTrueTest(){
        Palindrome palindrome = new Palindrome();
        String text = "racecar";
        boolean realResult = palindrome.palindrome(text);
        equalCheck(realResult,"isPalindromeTrueTest");
    }

    void isPalindromeTrueTest2(){
        Palindrome palindrome = new Palindrome();
        String text = "RAcecar";
        boolean realResult = palindrome.palindrome(text);
        equalCheck(realResult,"isPalindromeTrueTest2");
    }

    void isPalindromeFalseTest(){
        Palindrome palindrome = new Palindrome();
        String text = "qwerty";
        boolean realResult = palindrome.palindrome(text);
        equalCheck(!realResult,"isPalindromeFalseTest");
    }

    void isPalindromeTest1(){
        Palindrome palindrome = new Palindrome();
        String text = "Top spot";
        boolean realResult = palindrome.palindrome(text);
        equalCheck(realResult,"isPalindromeTest1");
    }

    void isPalindromeTest2(){
        Palindrome palindrome = new Palindrome();
        String text = "No lemon no melon";
        boolean realResult = palindrome.palindrome(text);
        equalCheck(realResult,"isPalindromeTest2");
    }

    void equalCheck(boolean realResult,String testName){
        if (realResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAIL");
        }
    }

}

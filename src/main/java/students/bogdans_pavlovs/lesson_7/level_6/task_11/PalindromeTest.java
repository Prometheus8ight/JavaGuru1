package students.bogdans_pavlovs.lesson_7.level_6.task_11;

class PalindromeTest {

    public static void main(String[] args) {

        PalindromeTest palindromeTest = new PalindromeTest();
        palindromeTest.palindromeTest1();
        palindromeTest.palindromeTest2();
        palindromeTest.palindromeTest3();
    }

    void palindromeTest1 (){

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("rAcEcaR");
        checkResult(result, "Palindrome Test 1");

    }

    void palindromeTest2 (){
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("А роза упала на лапу Азора");
        checkResult(result, "Palindrome Test 2");
    }

    void palindromeTest3 (){
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("carecar Азора");
        checkResult(!result, "Palindrome Test 3");
    }


    void checkResult (boolean result, String testName){

        if (result){
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }

    }
}

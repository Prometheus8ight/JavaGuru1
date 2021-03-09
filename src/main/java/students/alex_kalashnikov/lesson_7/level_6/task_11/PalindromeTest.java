package students.alex_kalashnikov.lesson_7.level_6.task_11;

class PalindromeTest {

    public static void main(String[] args) {

        PalindromeTest newObject = new PalindromeTest();
        newObject.testSingleWordPalindrome();
        newObject.testMultiWordPalindrome();
        newObject.testMultiWordPalindromeWithPunctuation();
        newObject.testNegativePalindrome();

    }

    void test(String text, boolean expectedResult) {
        Palindrome newPalindrome = new Palindrome();
        boolean realResult = newPalindrome.isPalindrome(text);
        if (expectedResult == realResult) {
            System.out.println("Palindrome Test is OK!");
        } else {
            System.out.println("Palindrome Test is FAILED!");
        }
    }

    void testSingleWordPalindrome() {
        test("tenet", true);
    }

    void testMultiWordPalindrome() {
        test("а роза упала на лапу азора", true);
    }

    void testMultiWordPalindromeWithPunctuation() {
        test("А роза - упала, на лапу Азора!", true);
    }

    void testNegativePalindrome() {
        test("sums summus mus", false);
    }

}

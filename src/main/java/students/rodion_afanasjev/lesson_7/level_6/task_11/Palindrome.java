package students.rodion_afanasjev.lesson_7.level_6.task_11;

class Palindrome {

    boolean isPalindrome(String text) {
        text = lowerCase(text);
        String[] letter = letterArray(text);

        int i = 0, j = letter.length -1;
        while ( i < j){
            if (!letter[i].equals(letter[j]))
                return false;
            i++;
            j--;
        }
        return true;
    }

    String[] letterArray(String text) {
        return text.split("");
    }

    String lowerCase(String text) {
        return text.toLowerCase();
    }

}

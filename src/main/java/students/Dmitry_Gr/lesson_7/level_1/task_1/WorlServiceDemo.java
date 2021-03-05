package students.Dmitry_Gr.lesson_7.level_1.task_1;

 class WorlServiceDemo {

    public  static void main(String[] args) {
        String strRandom = "qwertyu, asdawrqw qw asfasfa sfawtet  qwertyu asfasfa. 34n qw,.} qw qw a; a' a., a{[ a}], a a//.";
        WordService wordService = new WordService();
        String word = wordService.findMostFrequentWord(strRandom);
        System.out.println(word);
    }
}

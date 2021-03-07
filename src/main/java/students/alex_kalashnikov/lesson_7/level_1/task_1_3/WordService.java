package students.alex_kalashnikov.lesson_7.level_1.task_1_3;

import java.util.Locale;

class WordService {

    public String generateText(String text) {            // метод задает текст для задачи
        return text;
    }

    public String cleanText(String text) {                  // метод возвращает текст очищенный от знаков препинания (!,?,точка,запятая) и конвертирует заглавные буквы в маленькие, с пробелом между словами
        String text1 = text.replaceAll("!", "");
        String text2 = text1.replaceAll("\\?", "");
        String text3 = text2.replaceAll("\\.", "");
        String text4 = text3.replaceAll(",", "");
        String textFinal = text4.toLowerCase(Locale.ROOT);
        return textFinal;
    }

    public String[] createWordsArray(String cleanText) {      // создаем массив из слов
        String[] words = cleanText.split(" ");
        return words;

    }

    public String[] createEqualWordsArray(String[] words) {  // создаем отдельный массив для слов, которые повторяются
        String[] equalWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (i != j && words[i].equals(words[j])) {
                    equalWords[i] = words[i];
                }
            }
        }
        return equalWords;
    }

    public String[] removeNullEqualWordsArray(String[] equalWords) { // убираем из значений незанятых ячеек значение NULL
        for (int i = 0; i < equalWords.length; i++) {
            if (equalWords[i] == null) {
                equalWords[i] = "";
            }
        }
        return equalWords;
    }

    public String[] removeRepeatEqualWordsArray(String[] equalWordsWithoutNull) {  // убираем из массива повторения слов - должно остаться одно значение слова, которое повторяется в тексте
        for (int i = 0; i < equalWordsWithoutNull.length; i++) {
            for (int j = i; j < equalWordsWithoutNull.length; j++) {
                if (i != j && equalWordsWithoutNull[i].equals(equalWordsWithoutNull[j])) {
                    equalWordsWithoutNull[j] = "";
                }
            }
        }
        return equalWordsWithoutNull;
    }

    public int[] countEqualWordsArray(String[] equalWordsFinal, String[] words) {  // создаем массив чисел, где каждая отдельная ячейка содержит кол-во совпадений слов из массива equalWords со словами в массиве Words
        int[] count = new int[equalWordsFinal.length];

        for (int i = 0; i < equalWordsFinal.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (equalWordsFinal[i] != "" && equalWordsFinal[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        return count;
    }

    public int max(int[] count) {  // возвращает максимальное значение в массиве count
        int max = count[0];
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        return max;
    }

    public int findIndexMax(int[] count, int max) { // находит номер ячейки в массиве count с максимальным значением
        int index = -1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                index = i;
                break; // возвращает номер ячейки с первым максимальным значением и прекращает цикл
            }
        }
        return index;
    }

    public String findMostFrequentWord(String[] equalWordsFinal, int index) { // возвращает слово в массиве equalWords, которое повторяется чаще всего
        return equalWordsFinal[index];
    }

}
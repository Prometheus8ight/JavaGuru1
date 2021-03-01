package students.kristine_paskevica.lesson_6.level_3;

class ArrayService13 {

    int countOccurrences(int[] masivs, int mekleSkMasiva) {
        int count = 0;
        for (int masivElem : masivs) {
            if (masivElem == mekleSkMasiva) {
                count++;
            }
        }
        return count;
    }
}

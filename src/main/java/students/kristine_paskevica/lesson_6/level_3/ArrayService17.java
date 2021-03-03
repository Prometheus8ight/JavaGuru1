package students.kristine_paskevica.lesson_6.level_3;

class ArrayService17 {

    void kartotMasivu(int[] masivs) {
        int tukss;
        for (int i = 1; i < masivs.length; i++) {
            for (int j = i; j > 0; j--) {
                if (masivs[j] < masivs[j - 1]) {
                    tukss = masivs[j];
                    masivs[j] = masivs[j - 1];
                    masivs[j - 1] = tukss;
                }
            }
        }
    }
}


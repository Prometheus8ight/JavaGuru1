package students.kristine_paskevica.lesson_6.level_3;

public class ArrayService16 {

    void apgrieztPretejiMasivu(int[] masivs) {
        int tukss;
        int masivaBeigas = masivs.length - 1;
        for (int i = 0; i < masivs.length / 2; i++) {
            tukss = masivs[i];
            masivs[i] = masivs[masivaBeigas];
            masivs[masivaBeigas] = tukss;
            masivaBeigas--;
        }
    }
}

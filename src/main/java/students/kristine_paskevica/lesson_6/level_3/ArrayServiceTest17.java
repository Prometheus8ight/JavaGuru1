package students.kristine_paskevica.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest17 {

    public static void main(String[] args) {

        ArrayServiceTest17 testi = new ArrayServiceTest17();
        testi.kartotMasivuTests();
        testi.kartoTuksuMasivu();
    }

    void parbaudesTestaRez(int[] parbaudesRezult, int[] realaisRezult, String testaVards) {
        if (Arrays.equals(parbaudesRezult, realaisRezult)){
            System.out.println(testaVards + " - pārbaude ir precīza");
        } else {
            System.out.println(testaVards + " - pārbaude nav precīza");
        }
    }

    void kartotMasivuTests(){
        ArrayService17 testi = new ArrayService17();
        int[] masivs = {4, 3, 5, 2, 1};
        int[] parbaudesRezult = {1, 2, 3, 4, 5};
        testi.kartotMasivu(masivs);
        parbaudesTestaRez(parbaudesRezult, masivs, "Masīva elementu kārtošanas tests");
    }

    void kartoTuksuMasivu(){
        ArrayService17 testi = new ArrayService17();
        int[] masivs = {0, 0, 0, 0, 0};
        int[] parbaudesRezult = {0, 0, 0, 0, 0};
        testi.kartotMasivu(masivs);
        parbaudesTestaRez(parbaudesRezult, masivs, "Tukša masīva kārtošana");
    }
}

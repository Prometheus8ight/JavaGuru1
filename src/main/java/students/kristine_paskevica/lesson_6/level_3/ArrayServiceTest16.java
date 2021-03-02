package students.kristine_paskevica.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest16 {

    public static void main(String[] args) {

        ArrayServiceTest16 testi = new ArrayServiceTest16();
        testi.apgrieztPretejiMasivu();

    }

    void parbaudesTestaRez(int[] parbaudesRezult, int[] realaisRezult, String testaVards) {
        if (Arrays.equals(parbaudesRezult, realaisRezult)) {
            System.out.println(testaVards + " - pārbaude ir precīza");
        } else {
            System.out.println(testaVards + " - pārbaude nav precīza");
        }
    }

    void apgrieztPretejiMasivu() {
        ArrayService16 testi = new ArrayService16();
        int[] masivs = {5, 6, 7, 8, 9, 10};
        int[] parbaudesRezult = {10, 9, 8, 7, 6, 5};
        testi.apgrieztPretejiMasivu(masivs);
        parbaudesTestaRez(parbaudesRezult, masivs, "Masīvs apgriezts pretējā virzienā");
    }
}

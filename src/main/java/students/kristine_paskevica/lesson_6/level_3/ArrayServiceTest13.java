package students.kristine_paskevica.lesson_6.level_3;

class ArrayServiceTest13 {

    public static void main(String[] args) {

        ArrayServiceTest13 testi = new ArrayServiceTest13();
        testi.navAtrasts();
        testi.diviElementi();
        testi.cetriElementi();

    }

    void parbaudesTestaRez(int parbaudesRezult, int realaisRezult, String testaVards) {
        if (parbaudesRezult == realaisRezult) {
            System.out.println(testaVards + " - pārbaude ir precīza");
        } else {
            System.out.println(testaVards + " - pārbaude nav precīza");
        }
    }

    void navAtrasts() {
        ArrayService13 arrayService13 = new ArrayService13();
        int[] masivs = {3, 8, 11, 19, 31, 25};
        parbaudesTestaRez(0, arrayService13.countOccurrences(masivs, 7),
                "Elements nav atrasts");
    }

    void diviElementi() {
        ArrayService13 arrayService13 = new ArrayService13();
        int[] masivs = {3, 8, 11, 19, 31, 11, 13};
        parbaudesTestaRez(2, arrayService13.countOccurrences(masivs, 11),
                "Divi vienādi elementi ir atrasti");
    }

    void cetriElementi() {
        ArrayService13 arrayService13 = new ArrayService13();
        int[] masivs = {3, 8, 11, 19, 31, 11, 13, 11, 23, 28, 11};
        parbaudesTestaRez(4, arrayService13.countOccurrences(masivs, 11),
                "Četri vienādi elementi ir atrasti");
    }
}


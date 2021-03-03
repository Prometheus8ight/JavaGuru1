package students.kristine_paskevica.lesson_6.level_4;

class TwoDimensionalArrayTests {

    public static void main(String[] args) {

        TwoDimensionalArrayTests testi = new TwoDimensionalArrayTests();
        testi.masivaSum();
    }

    void rezultParbaude(int parbaudRezult, int realaisRezult, String testaVards) {
        if (parbaudRezult == realaisRezult) {
            System.out.println(testaVards + " - patiess");
        } else {
            System.out.println(testaVards + " - nav patiess");
        }
    }

    void masivaSum() {
        TwoDimensionalArray testi = new TwoDimensionalArray();
        int[][] masivs = {{2, 2, 6, 2}, {2, 6, 2, 1}, {11, 9, 1}};
        rezultParbaude(44, testi.divdimMasivs(masivs), "Masīva summas tests ir ");
    }
}

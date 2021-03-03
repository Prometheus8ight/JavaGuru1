package students.kristine_paskevica.lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {

        ArrayServiceTest testi = new ArrayServiceTest();
        testi.mekleMasElementuIrTrue();
        testi.mekleMasElementuIrFalse();
    }

    private void parbaudesTestaRez(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - pārbaude ir precīza");
        } else {
            System.out.println(testName + " - pārbaude nav precīza");
        }
    }

    void mekleMasElementuIrTrue() {
        ArrayService arrayService = new ArrayService();
        int[] masivs = {3, 33, 26, 30, 51};
        boolean realRezultats = arrayService.contains(masivs, 33);
        parbaudesTestaRez(realRezultats, "Meklētais elements atbilst");
    }

    void mekleMasElementuIrFalse() {
        ArrayService arrayService = new ArrayService();
        int[] masivs = {3, 33, 26, 30, 51};
        boolean realRezultats = arrayService.contains(masivs, 30);
        parbaudesTestaRez(realRezultats, "Meklētais elements neatbilst");
    }
}


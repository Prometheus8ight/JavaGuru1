package students.kristine_paskevica.lesson_6.level_3;

class ArrayServiceTest15 {

    public static void main(String[] args) {

        ArrayServiceTest15 testi = new ArrayServiceTest15();
        testi.aizvietoVienuTests();
        testi.neaizvietoTests();
        testi.aizvietoCetrusTests();

    }

    void parbaudesTestaRez(int parbaudesRezult, int realaisRezult, String testaVards) {
        if (parbaudesRezult == realaisRezult) {
            System.out.println(testaVards + " - pārbaude ir precīza");
        } else {
            System.out.println(testaVards + " - pārbaude nav precīza");
        }
    }

    void neaizvietoTests(){
        ArrayService15 arrayService15 = new ArrayService15();
        int[] masivs = {2, 33, 43, 59, 98};
        parbaudesTestaRez(0, arrayService15.aizvietoVisus(masivs, 99, 7), "Aizvietošana nav notikusi");
    }

    void aizvietoVienuTests(){
        ArrayService15 arrayService15 = new ArrayService15();
        int[] masivs = {2, 33, 43, 59, 98};
        parbaudesTestaRez(1, arrayService15.aizvietoVisus(masivs, 43, 7), "Viena elementa aizvietošana ir notikusi");

    }

    void aizvietoCetrusTests(){
        ArrayService15 arrayService15 = new ArrayService15();
        int[] masivs = {2, 33, 43, 59, 98, 59, 34, 59, 32, 59};
        parbaudesTestaRez(4, arrayService15.aizvietoVisus(masivs, 59, 7), "Četru elementu aizvietošana ir notikusi");

    }
}

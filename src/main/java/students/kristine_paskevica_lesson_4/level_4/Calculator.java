package students.kristine_paskevica_lesson_4.level_4;

class Calculator {

    public int summeshana(int pirmaisSk, int otraisSk) {        //izveido summeshanas metodi
        return pirmaisSk + otraisSk;                            //atgriež ievadīto 2 skaitļu summu
    }

    public int starpiba(int pirmaisSk, int otraisSk) {
        return pirmaisSk - otraisSk;
    }

    public int reizinajums(int pirmaisSk, int otraisSk) {
        return pirmaisSk * otraisSk;
    }

    public int dalishana(int pirmaisSk, int otraisSk) {
        return pirmaisSk / otraisSk;
    }

    public boolean paraNepara(int ievadSkaitlis) {              //izveido metodi, kura pārbauda pāra vai nepāra sk
        if (ievadSkaitlis % 2 == 0) {
            return ievadSkaitlis % 2 == 0;
        } else {
            return false;
        }}

    public int lielSkaitlis(int pirmaisSk, int otraisSk) {      //izveido metodi, kura pārabuda kurš no 2 sk ir lielāks
        if (pirmaisSk > otraisSk) {
            return pirmaisSk;
        } else {
            return otraisSk;
        }
    }}

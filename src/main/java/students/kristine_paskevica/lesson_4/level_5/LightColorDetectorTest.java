package students.kristine_paskevica.lesson_4.level_5;

class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest krasuNoteikTests = new LightColorDetectorTest();
        krasuNoteikTests.violetTest();
        krasuNoteikTests.zilaTast();
        krasuNoteikTests.zalsTest();
        krasuNoteikTests.dzeltensTest();
        krasuNoteikTests.oranzsTest();
        krasuNoteikTests.sarkansTest();
        krasuNoteikTests.nenoteiktaKrasaTest();
    }
    public void violetTest(){
        int vilnaGarums=449;
        String parbaudaRezultatu="Violets";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Violetās krāsas pārbaude ir precīza");
        }
            else{
            System.out.println("Violetās krāsas pārbaude nav precīza");
        }
    }
    public void zilaTast(){
        int vilnaGarums=490;
        String parbaudaRezultatu="Zila";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Zilās krāsas pārbaude nav precīza");
        }
        else{
            System.out.println("Zilās krāsas pārbaude ir precīza");
        }

}
    public void zalsTest(){
        int vilnaGarums=501;
        String parbaudaRezultatu="Zaļš";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Zaļās krāsas pārbaude ir precīza");
        }
        else{
            System.out.println("Zaļās krāsas pārbaude nav precīza");
        }

}
    public void dzeltensTest(){
        int vilnaGarums=580;
        String parbaudaRezultatu="Dzeltens";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Dzeltenās krāsas pārbaude ir precīza");
        }
        else{
            System.out.println("Dzeltenās krāsas pārbaude nav precīza");
        }

    }
    public void oranzsTest(){
        int vilnaGarums=601;
        String parbaudaRezultatu="Oranžs";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Oranžās krāsas pārbaude ir precīza");
        }
        else{
            System.out.println("Oranžās krāsas pārbaude nav precīza");
        }

    }
    public void sarkansTest(){
        int vilnaGarums=630;
        String parbaudaRezultatu="Sarkans";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Sarkanās krāsas pārbaude ir precīza");
        }
        else{
            System.out.println("Sarkanās krāsas pārbaude nav precīza");
        }

    }
    public void nenoteiktaKrasaTest(){
        int vilnaGarums=122;
        String parbaudaRezultatu="Neatbilst";
        LightColorDetector noteicejs = new LightColorDetector();
        String realaisRezultats = noteicejs.noteikts(vilnaGarums);
        if (realaisRezultats==parbaudaRezultatu){
            System.out.println("Neatbilstības pārabude nav precīza");
        }
        else{
            System.out.println("Neatbilstības pārbaude ir precīza");
        }

    }
}

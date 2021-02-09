package students.kristine_paskevica.lesson_3.level_7;

 class Masina {


     String ipasnieks;
     String masinasNumurs;
     String masinasMarka;

     void masinasRakst(){
         System.out.println("Mašīnas " + masinasMarka + " valsts numura zīmes " + masinasNumurs + " īpašnieks ir " + ipasnieks);
     }
     void masinasPard(){
        int sakCena = 16000;
        int atlaide = 1000;
        int masinasCena = sakCena - atlaide;
         System.out.println("Mašīna tiek pārdota, ņemot vērā atlaidi " + atlaide + " EUR, par " + masinasCena + " EUR.");
     }}



package students.kristine_paskevica.lesson_6.level_3;

 class ArrayServiceTest14 {

     public static void main(String[] args) {

         ArrayServiceTest14 testi = new ArrayServiceTest14();
         testi.aizvietoTrue();
         testi.aizvietoFalse();

     }
     void parbaudesTestaRez(boolean patiessNepatiess, String testaVards) {
         if (patiessNepatiess) {
             System.out.println(testaVards + " - pārbaude ir precīza");
         } else {
             System.out.println(testaVards + " - pārbaude nav precīza");
         }
     }

     void aizvietoTrue(){
         ArrayService14 arrayService14 = new ArrayService14();
         int[] masivs = {2, 8, 11, 16, 21};
         boolean realaisRezult = arrayService14.aizvietotPirmo(masivs, 16, 1);
         parbaudesTestaRez(realaisRezult, "Aizvietošana ir notikusi");
     }

     void aizvietoFalse(){
         ArrayService14 arrayService14 = new ArrayService14();
         int[] masivs = {2, 8, 11, 16, 21};
         boolean realaisRezult = arrayService14.aizvietotPirmo(masivs, 50, 1);
         parbaudesTestaRez(realaisRezult, "Aizvietošana nav notikusi");
     }
}

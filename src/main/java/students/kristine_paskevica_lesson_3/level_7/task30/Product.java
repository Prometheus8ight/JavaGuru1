package students.kristine_paskevica_lesson_3.level_7.task30;

 class Product {

     String precesNosauk;
     double regulCena;
     double atlaide;

     public Product(String precesNosauk) {
         this.precesNosauk = precesNosauk;
     }

     public void setRegulCena(double regulCena) {
         this.regulCena = regulCena;
     }

     public void setAtlaide(double atlaide) {
         this.atlaide = atlaide;
     }
     double cenaArAtlaidi(){
         return this.regulCena - this.regulCena*this.atlaide;
     }
     void printInformation(){
         System.out.println("Preces televīzora " + precesNosauk + " standarta cena ir " + regulCena + " EUR");
         System.out.printf("Ņemot vērā piešķirto atlaidi " + atlaide + " procentu apmērā, Jūsu preces cena ir " + "%.2f",cenaArAtlaidi());
         System.out.print(" EUR");
     }}

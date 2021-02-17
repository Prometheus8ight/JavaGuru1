package students.kristine_paskevica.lesson_4.level_6_task_17;

 class StockTest {

     public static void main(String[] args) {

         StockTest akcijasTests = new StockTest();

         akcijasTests.testsCenasAtjaun();
         akcijasTests.testsMaksCena1();
         akcijasTests.testsMaksCena2();
         akcijasTests.testsMaksCena3();
         akcijasTests.testsMaksCena4();
         akcijasTests.testsMaksCena5();
     }

     public void testsCenasAtjaun(){            //pārbaudam iespējamo vērtību scenārijus 10 -> 12 -> 5 -> 7 -> 99 -> 77

         int testsIstaiCecena = 77;
         int testsMinCenai = 5;
         int testsMaxCenai = 99;

         Stock testStock = new Stock("Test", 10);
         testStock.vertibuAtjaunoshana(12);
         testStock.vertibuAtjaunoshana(5);
         testStock.vertibuAtjaunoshana(7);
         testStock.vertibuAtjaunoshana(99);
         testStock.vertibuAtjaunoshana(77);

         int istaVertiba = testStock.tekoshaMaksa;
         int minIstaCena = testStock.minMaksa;
         int maxIstaCena = testStock.maxMaksa;

         if (istaVertiba == testsIstaiCecena){
             System.out.println("Tekošās cenas pārbaude ir precīza");
         } else {
             System.out.println("Tekošās cenas pārbaude nav precīza");
         }
         if (minIstaCena == testsMinCenai){
             System.out.println("Zemākās cenas pārbaude ir precīza");
         } else {
             System.out.println("Zemākās cenas pārbaude nav precīza");
         }
         if (maxIstaCena == testsMaxCenai){
             System.out.println("Lielākās cenas pārbaude ir precīza");
         } else {
             System.out.println("Lielākās cenas pārbaude nav precīza");
         }
     }

     public void testsMaksCena1(){              //pārbaudām, ja akcijas cena mainās: max cena par periodu 999

         int parbRezultats = 999;

         Stock testStock = new Stock("Test", 999);

         int realaisRezultats = testStock.maxMaksa;

         if(parbRezultats == realaisRezultats){
             System.out.println("Maksimālās cenas pirmā pārbaude ir precīza");
         } else {
             System.out.println("Maksimālās cenas pirmā pārbaude nav precīza");
         }
     }

     public void testsMaksCena2(){              //pārbaudām, ja akcijas cena mainās: max cena par periodu 999 -> 1

         int parbRezultats = 999;

         Stock testStock = new Stock("Test", 999);
         testStock.vertibuAtjaunoshana(1);

         int realaisRezultats = testStock.maxMaksa;

         if(parbRezultats == realaisRezultats){
             System.out.println("Maksimālās cenas otrās pārbaude ir precīza");
         } else {
             System.out.println("Maksimālās cenas otrās pārbaude nav precīza");
           }
     }

     public void testsMaksCena3(){              //pārbaudām, ja akcijas cena mainās: max cena par periodu 999 -> 2 -> 1000

         int parbRezultats = 1000;

         Stock testStock = new Stock("Test", 999);
         testStock.vertibuAtjaunoshana(2);
         testStock.vertibuAtjaunoshana(1000);

         int realaisRezultats = testStock.maxMaksa;

         if(parbRezultats == realaisRezultats){
             System.out.println("Maksimālās cenas trešās pārbaude ir precīza");
         } else {
             System.out.println("Maksimālās cenas trešās pārbaude nav precīza");
         }
     }

     public void testsMaksCena4(){              //pārbaudām, ja akcijas cena mainās: max cena par periodu 999 -> 2 -> 1000 -> 8

         int parbRezultats = 1000;

         Stock testStock = new Stock("Test", 999);
         testStock.vertibuAtjaunoshana(2);
         testStock.vertibuAtjaunoshana(1000);
         testStock.vertibuAtjaunoshana(8);

         int realaisRezultats = testStock.maxMaksa;

         if(parbRezultats == realaisRezultats){
             System.out.println("Maksimālās cenas ceturtās pārbaude ir precīza");
         } else {
             System.out.println("Maksimālās cenas ceturtās pārbaude nav precīza");
         }
     }

     public void testsMaksCena5(){              //pārbaudām, ja akcijas cena mainās 9 -> 27: max cena par periodu 27

         int parbRezultats = 27;

         Stock testStock = new Stock("Test", 9);
         testStock.vertibuAtjaunoshana(27);

         int realaisRezultats = testStock.maxMaksa;

         if(parbRezultats == realaisRezultats){
             System.out.println("Maksimālās cenas piektās pārbaude ir precīza");
         } else {
             System.out.println("Maksimālās cenas piektās pārbaude nav precīza");
         }
     }
 }




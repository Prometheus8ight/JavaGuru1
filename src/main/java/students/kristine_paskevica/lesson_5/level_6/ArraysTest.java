package students.kristine_paskevica.lesson_5.level_6;

 class ArraysTest {

     public static void main(String[] args) {
         ArraysTest test = new ArraysTest();
         test.shouldCreateArray();
         test.shouldFindMaxNumber();
         test.shouldFindMinNumber();
     }

     public void shouldCreateArray() {
         int[] parbMasivaGarums = new int[4];
         Arrays masivaTests = new Arrays();
         int[] masivGarums = masivaTests.create(4);
            if (masivGarums.length == parbMasivaGarums.length){
                System.out.println("Masīva garuma tests ir OK!");
            }
            else {
                System.out.println("Masīva garuma tests nav OK!");
            }
     }

     public void shouldFindMaxNumber() {
         Arrays masivaTests = new Arrays();
         int[] masivElemen = {50, 10, -25, 89};
         int parbaudaMax = 89;
         int realaisMax = masivaTests.findMax(masivElemen);
            if (realaisMax == parbaudaMax){
             System.out.println("Tests lielākajai vērtībai ir OK");
         }
            else {
             System.out.println("Tests lielākajai vērtībai nav OK");
         }
     }

     public void shouldFindMinNumber() {
         Arrays masivaTests = new Arrays();
         int[] masivElemen = {50, 10, -25, 89};
         int parbaudaMin = -25;
         int realaisMin = masivaTests.findMin(masivElemen);
            if (realaisMin == parbaudaMin){
             System.out.println("Tests mazākajai vērtībai ir OK");
         }
            else {
             System.out.println("Tests mazākajai vērtībai nav OK");
         }
     }
 }


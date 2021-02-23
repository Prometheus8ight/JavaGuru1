package students.kristine_paskevica.lesson_5.level_5_Tas31;

 class ArraysTest {

     public static void main(String[] args) {
         ArraysTest test = new ArraysTest();
         test.shouldCreateArray();
     }

     public void shouldCreateArray() {
         int parbaudesRezult = 4;
         Arrays masivs = new Arrays();
         int[] elemSkaits = masivs.create(4);
         int realRez = elemSkaits.length;

         if(parbaudesRezult == realRez){
             System.out.println("Pārbaude ir precīza");
         }else {
             System.out.println("Pārbaude nav precīza");
         }
     }
}

package students.kristine_paskevica.lesson_6.level_5;

 class TicTacToeTest26 {

     public static void main(String[] args) {
         TicTacToeTest26 testi = new TicTacToeTest26();
         testi.pozicija1(new int[][]{{-1, -1, -1}, {1, 1, 1}, {-1, -1, 0}});
         testi.pozicija2(new int[][]{{1, 0, 1}, {0, 0, 1}, {1, 1, 0}});
         testi.pozicija3(new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}});
     }

     public void pozicija1 (int[][] field) {
         TicTacToe26 testi = new TicTacToe26();
         boolean realResult = testi.isDrawPosition(field);
         check(realResult, false, "Tests 1");
     }

     public void pozicija2 (int[][] field) {
         TicTacToe26 testi = new TicTacToe26();
         boolean realResult = testi.isDrawPosition(field);
         check(realResult, true, "Tests 2");
     }

     public void pozicija3 (int[][] field) {
         TicTacToe26 testi = new TicTacToe26();
         boolean realResult = testi.isDrawPosition(field);
         check(realResult, false, "Tests 3");
     }

     public void check (boolean realResult, boolean expectedResult, String testName) {
         if (realResult == expectedResult) {
             System.out.println(testName + " = ir precīza");
         }
         else {
             System.out.println(testName + " = nav precīza");
         }
     }
}

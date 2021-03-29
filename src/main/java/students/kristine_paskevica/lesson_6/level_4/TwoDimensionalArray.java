package students.kristine_paskevica.lesson_6.level_4;

 class TwoDimensionalArray {

          int divdimMasivs(int[][] masivs){
             int sum = 0;
             for (int i = 0; i < masivs.length; i++) {
                 for (int j = 0; j < masivs[i].length; j++) {
                     sum += masivs[i][j];
                 }
             }
             return sum;
         }
     }



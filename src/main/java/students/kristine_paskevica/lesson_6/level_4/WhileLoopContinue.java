package students.kristine_paskevica.lesson_6.level_4;

 class WhileLoopContinue {

     public static void main(String[] args) {
         int i = 0;
         while (i < 5) {
             if (i == 3) {
                 continue;
             }
             System.out.println(i);
             i++;
         }
     }
 }


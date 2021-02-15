package students.kristine_paskevica.lesson_4.level_5;

 class LightColorDetector {

     public String noteikts(int vilnaGarums) {
         if (vilnaGarums >=380 && vilnaGarums <=449 ){              //pieļauju domu, ka šeit varētu izmantot arī Switch
             return "Violets";
         }
         else if (vilnaGarums >=450 && vilnaGarums <=494){
             return "Zils";
         }
         else if (vilnaGarums >=495 && vilnaGarums <=569){
             return "Zaļš";
         }
         else if (vilnaGarums >=570 && vilnaGarums <=589){
             return "Dzeltens";
         }
         else if (vilnaGarums >=590 && vilnaGarums <=619){
             return "Oranžs";
         }
         else if (vilnaGarums >=620 && vilnaGarums <=750){
             return "Sarkans";
         }
         else{
             return "Nenosakāms spektrs";
         }
     }
}

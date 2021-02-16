package students.kristine_paskevica_lesson_4.level_7.task23;

 class LeapYear {

     public boolean isLeapYear(int year){

      if (year % 4 != 0){          //ja gads nedalās ar 4, tas ir parasts gads
       return false;
      }
      else if (year % 100 != 0){   //ja gads nedalās ar 100, tad tas būs garais gads
       return true;
      }
      else if (year % 400 == 0){   //ja dalās, tad tas ir garais gads
       return true;
      }
      else{
       return false;
      }
     }
 }

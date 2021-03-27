package students.kate_br.lesson_10.level_2.task_5;


class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

     @Override
     public String detectDayName(int number) {
         String[] arr = {
                 "Monday",
                 "Tuesday",
                 "Wednesday",
                 "Thursday",
                 "Friday",
                 "Saturday",
                 "Sunday"
         };
         return arr[number - 1];
     }
 }

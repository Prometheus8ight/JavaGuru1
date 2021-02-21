package students.arkadij.lesson_4.task_23;

class LeapYear {

    public boolean theLeapYear(int year){
        if (year % 4 == 0) {
            return (year % 100 != 0) || (year % 400 == 0);
        }   return false;
    }

}

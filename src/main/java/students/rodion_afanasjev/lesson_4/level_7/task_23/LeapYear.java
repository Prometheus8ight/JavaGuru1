package students.rodion_afanasjev.lesson_4.level_7.task_23;

class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

package students.lolita_polakova.lesson_4.level_7.task_23;

class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
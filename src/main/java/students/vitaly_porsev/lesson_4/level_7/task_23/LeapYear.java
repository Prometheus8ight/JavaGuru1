package students.vitaly_porsev.lesson_4.level_7.task_23;

class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return (year % 100 != 0) || (year % 400 == 0);
        }return false;
    }
}

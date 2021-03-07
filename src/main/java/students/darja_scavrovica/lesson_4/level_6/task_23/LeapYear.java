package students.darja_scavrovica.lesson_4.level_6.task_23;

class LeapYear {
    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        if (year % 4!=0) {  // Если год не делится на 4, значит он обычный.
            return false;
        } else if (year % 100!=0) {   // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
            return true;
        } else if (year%400==0) {  // Если год делится на 400, то он високосный.
            return true;
        } else {
            return false;
        }

    }
}

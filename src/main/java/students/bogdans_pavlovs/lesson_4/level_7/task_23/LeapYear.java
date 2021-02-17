package students.bogdans_pavlovs.lesson_4.level_7.task_23;

class LeapYear {

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {

        if(year % 4 != 0){
            return false;               // Если год не делится на 4, значит он обычный.
        } else if (year % 100 != 0){
            return true;                // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        } else if (year % 400 == 0){
            return true;                // Если год делится на 400, то он високосный.
        } else {
            return false;               // Иначе год обычный.
        }

    }

}

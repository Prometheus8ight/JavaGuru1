package students.deniss_jankovskis.lesson_4.level_7;

class LeapYear {

    public boolean leapYear(int year) {
        if (year % 4 != 0) {        //Если год не делится на 4, значит он обычный.
            return false;
        }
        else if (year % 100 != 0) { //Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
            return true;
        }
        else if (year % 400 == 0) { //Если год делится на 400, то он високосный.
            return true;
        }
        else {                      //Иначе год обычный.
            return false;
        }

    }


}

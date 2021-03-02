package students.kristine_paskevica.lesson_6.level_3;

class ArrayService {

   boolean contains (int[] masivs, int mekleSkaitli) {      //metode, kura meklēs veselus sk masīvā
        for (int elemNum : masivs) {
            if (elemNum == mekleSkaitli) {
                return true;
            }
        }
        return false;
    }
}

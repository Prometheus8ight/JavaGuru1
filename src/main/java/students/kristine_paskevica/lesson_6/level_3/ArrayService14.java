package students.kristine_paskevica.lesson_6.level_3;

class ArrayService14 {

    boolean aizvietotPirmo(int[] masivs, int elementuKuruAizvieto, int jaunaisElemen) {
        for (int i = 0; i < masivs.length; i++) {
            if (masivs[i] == elementuKuruAizvieto) {
                masivs[i] = jaunaisElemen;
                return true;
            }
        }
        return false;
    }
}



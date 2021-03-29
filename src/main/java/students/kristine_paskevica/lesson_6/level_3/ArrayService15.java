package students.kristine_paskevica.lesson_6.level_3;

class ArrayService15 {

    int aizvietoVisus(int[] masivs, int elemenKuruAizvieto, int jaunaisElem) {
        int count = 0;
        for (int i = 0; i < masivs.length; i++) {
            if (masivs[i] == elemenKuruAizvieto){
                masivs[i] = jaunaisElem;
                count++;
            }
        }
        return count;
    }
}

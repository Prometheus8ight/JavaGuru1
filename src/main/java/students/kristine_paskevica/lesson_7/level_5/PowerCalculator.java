package students.kristine_paskevica.lesson_7.level_5;

class PowerCalculator {

    public int elevate(int sk, int pakape) {
        int kapinasana = sk;
        for (int i = 1; i < pakape; i++) {
            kapinasana *= sk;
        }
        return kapinasana;
    }
}

package students.kristine_paskevica.lesson_6.level_1;

class NumberUtilTest {

    public static void main(String[] args) {

        NumberUtilTest parbTests = new NumberUtilTest();
        parbTests.nepSkaitlis(27);
        parbTests.paraSkaitlis(26);

    }

    public void nepSkaitlis(int number) {

        boolean parbRezult = false;
        NumberUtils numberUtils = new NumberUtils();
        boolean realRezult = numberUtils.isEven(27);
        if (realRezult == parbRezult) {
            System.out.println("Nepāra skaitļa pārbaude ir precīza!");

        } else {
            System.out.println("Nepāra skaitļa pārbaude nav precīza!");
        }
    }

    public void paraSkaitlis(int number) {

        boolean parbRezult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean realRezult = numberUtils.isEven(26);
        if (realRezult == parbRezult) {
            System.out.println("Pāra skaitļa pārbaude ir precīza!");

        } else {
            System.out.println("Pāra skaitļa pārbaude nav precīza!");
        }
    }
}


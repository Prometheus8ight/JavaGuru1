package students.kristine_paskevica.lesson_5.level_6;

class ArraysDemo {
    public static void main(String[] args) {

        Arrays masivs = new Arrays();
        int [] elemSkaits = masivs.create(4);
        System.out.println("Masīvs veidosies no: " + elemSkaits.length + " elementiem");
        masivs.fillRandomly(elemSkaits);
        masivs.print(elemSkaits);
        System.out.println("Masīva lielākais elements ir: " + masivs.findMax(elemSkaits));
        System.out.println("Masīva mazākais elements ir: " + masivs.findMin(elemSkaits));
    }
}

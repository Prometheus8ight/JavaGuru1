package students.bogdans_pavlovs.lesson_8.level_6;

class VarargsDemo {

    public static void main(String[] args) {

        Varargs varargs = new Varargs();

        System.out.println("Total Sum 1 = " + varargs.calculateSum(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        System.out.println("Total Sum 2 = " + varargs.calculateSum(2, 3, 10));
        System.out.println("Total Sum 3 = " + varargs.calculateSum(5, 5, 5, 7, 7, 10, 2312312));


    }

}

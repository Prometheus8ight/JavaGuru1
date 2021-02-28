package students.arkadij.lesson_6.level_4.task_21;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        System.out.println("Dimensional numbers:");
        System.out.println("1+3+5 & 2+4+6");
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.twoSumArray();

        System.out.println("\nAutomated test for dimensional:");
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.allTests();

    }

}

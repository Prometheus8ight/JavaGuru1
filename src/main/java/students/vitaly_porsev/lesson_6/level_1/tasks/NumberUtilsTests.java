package students.vitaly_porsev.lesson_6.level_1.tasks;

class NumberUtilsTests {

    public static void main(String[] args) {
        NumberUtilsTests methods = new NumberUtilsTests();
        methods.evenTest();
        methods.oddTest();
    }

    void evenTest() {
        boolean expectedResult = true;
        NumberUtils method = new NumberUtils();
        boolean realResult = method.isEven(22);
        if (expectedResult == realResult) {
            System.out.println("evenTest - OK");
        } else {
            System.out.println("evenTest - FAIL");
        }
    }

    void oddTest() {
        boolean expectedResult = false;
        NumberUtils method = new NumberUtils();
        boolean realResult = method.isEven(23);
        if (expectedResult == realResult) {
            System.out.println("oddTest - OK");
        } else {
            System.out.println("oddTest - FAIL");
        }
    }
}


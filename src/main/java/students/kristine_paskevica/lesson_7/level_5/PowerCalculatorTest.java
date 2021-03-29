package students.kristine_paskevica.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest method = new PowerCalculatorTest();
        method.allTests();
    }

    void allTests() {
        PowerCalculatorTest method = new PowerCalculatorTest();
        method.kapinTests2();
        method.kapinTests3();
        method.kapinTests4();
        method.kapinTests5();
        method.kapinTests6();
        method.kapinTests7();
        method.kapinTests8();
        method.kapinTests9();
    }

    void kapinTests2() {
        PowerCalculator method = new PowerCalculator();
        checkResult(256, method.elevate(2, 8), "Kāpināšanas tests Nr 2");
    }

    void kapinTests3() {
        PowerCalculator method = new PowerCalculator();
        checkResult(19683, method.elevate(3, 9), "Kāpināšanas tests Nr 3");
    }

    void kapinTests4() {
        PowerCalculator method = new PowerCalculator();
        checkResult(4096, method.elevate(4, 6), "Kāpināšanas tests Nr 4");
    }

    void kapinTests5() {
        PowerCalculator method = new PowerCalculator();
        checkResult(390625, method.elevate(5, 8), "Kāpināšanas tests Nr 5");
    }

    void kapinTests6() {
        PowerCalculator method = new PowerCalculator();
        checkResult(7776, method.elevate(6, 5), "Kāpināšanas tests Nr 6");
    }

    void kapinTests7() {
        PowerCalculator method = new PowerCalculator();
        checkResult(2401, method.elevate(7, 4), "Kāpināšanas tests Nr 7");
    }

    void kapinTests8() {
        PowerCalculator method = new PowerCalculator();
        checkResult(512, method.elevate(8, 3), "Kāpināšanas tests Nr 8");
    }

    void kapinTests9() {
        PowerCalculator method = new PowerCalculator();
        checkResult(6561, method.elevate(9, 4), "Kāpināšanas tests Nr 9");
    }

    void checkResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " - ir precīzs");
        } else {
            System.out.println(" - nav precīzs");
        }
    }
}


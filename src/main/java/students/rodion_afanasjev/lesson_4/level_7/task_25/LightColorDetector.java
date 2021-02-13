package students.rodion_afanasjev.lesson_4.level_7.task_25;

class LightColorDetector {

    public void resultCheck(String realResult, String expectedResult) {
        if (realResult.equals(expectedResult)) {
            System.out.println("LightColorDetector test " + expectedResult + " = OK");
        } else {
            System.out.println("LightColorDetector test " + expectedResult + " = FAIL");
        }
    }

    public void testViolet(int wavelength) {
        String expectedResult = "Violet";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public void testBlue(int wavelength) {
        String expectedResult = "Blue";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public void testGreen(int wavelength) {
        String expectedResult = "Green";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public void testYellow(int wavelength) {
        String expectedResult = "Yellow";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public void testOrange(int wavelength) {
        String expectedResult = "Orange";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public void testRed(int wavelength) {
        String expectedResult = "Red";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public void testInvisible(int wavelength) {
        String expectedResult = "Invisible Light";
        String realResult = detect(wavelength);
        resultCheck(realResult, expectedResult);
    }

    public String detect(int wavelength) {

        if (wavelength >= 380 && wavelength <= 449) {
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }
}

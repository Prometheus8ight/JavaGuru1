package students.andrew_galashin.lesson_4.level_7.task_25;

class LightColorDetectorTest {
        public static void main(String[] args) {
            LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

            lightColorDetector.testViolet(405);
            lightColorDetector.testBlue(475);
            lightColorDetector.testGreen(505);
            lightColorDetector.testYellow(585);
            lightColorDetector.testOrange(619);
            lightColorDetector.testRed(620);
            lightColorDetector.testInvisible(760);
        }
        public void testViolet(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Violet", "Violet" );
        }
        public void testBlue(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Blue", "Blue" );
        }
        public void testGreen(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Green", "Green" );
        }
        public void testYellow(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Yellow", "Yellow" );
        }
        public void testOrange(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Orange", "Orange" );
        }
        public void testRed(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Red", "Red" );
        }
        public void testInvisible(int wavelength) {
            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = lightColorDetector.detect(wavelength);
            check(result,"Invisible", "Invisible" );
        }

        public void check (String result, String expectedResult, String testName){
        if(result.equals(expectedResult)) {
            System.out.println("LightColorDetector test: " + testName + " = is OK ");
        }
        else {
            System.out.println("LightColorDetector test: Invisible Light = FAIL");
        }
    }
    }


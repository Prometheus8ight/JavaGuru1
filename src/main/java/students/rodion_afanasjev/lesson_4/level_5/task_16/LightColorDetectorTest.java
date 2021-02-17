package students.rodion_afanasjev.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public void result(String realResult, String expectedResult){
        if (realResult.equals(expectedResult)) {
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void violet(){
        int waveLength = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

    public void blue(){
        int waveLength = 460;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

    public void green(){
        int waveLength = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

    public void yellow(){
        int waveLength = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

    public void orange(){
        int waveLength = 605;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

    public void red(){
        int waveLength = 650;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

    public void invisible(){
        int waveLength = 50;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        result(realResult, expectedResult);
    }

}

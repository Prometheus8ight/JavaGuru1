package students.rodion_afanasjev.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public void Result(String realResult, String expectedResult){
        if (realResult.equals(expectedResult)) {
            System.out.println("Success");
        }
        else {
            System.out.println("FAIL");
        }
    }

    public void Violet(){
        int waveLength = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

    public void Blue(){
        int waveLength = 460;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

    public void Green(){
        int waveLength = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

    public void Yellow(){
        int waveLength = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

    public void Orange(){
        int waveLength = 605;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

    public void Red(){
        int waveLength = 650;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

    public void Invisible(){
        int waveLength = 50;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        Result(realResult, expectedResult);
    }

}

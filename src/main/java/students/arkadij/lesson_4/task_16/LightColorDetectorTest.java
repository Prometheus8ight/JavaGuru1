package students.arkadij.lesson_4.task_16;

class LightColorDetectorTest {

    public void violetTest(){
        String expectedResult = "Violet!";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(440);
        if (expectedResult == realResult){
            System.out.println("Violet test ok!");
        } else {
            System.out.println("Violet test fail!");
        }
    }

    public void blueTest(){
        String expectedResult = "Blue!";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(493);
        if (expectedResult == realResult){
            System.out.println("Blue test ok!");
        } else {
            System.out.println("Blue test fail!");
        }
    }

    public void greenTest(){
        String expectedResult = "Green!";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(496);
        if (expectedResult == realResult){
            System.out.println("Green test ok!");
        } else {
            System.out.println("Green test fail!");
        }
    }

    public void yellowTest(){
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(580);
        if (expectedResult == realResult){
            System.out.println("Yellow test ok!");
        } else {
            System.out.println("Yellow test fail!");
        }
    }

    public void orangeTest(){
        String expectedResult = "Orange!";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(600);
        if (expectedResult == realResult){
            System.out.println("Orange test ok!");
        } else {
            System.out.println("Orange test fail!");
        }
    }

    public void redTest(){
        String expectedResult = "Red!";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(621);
        if (expectedResult == realResult){
            System.out.println("Red test ok!");
        } else {
            System.out.println("Red test fail!");
        }
    }

    public void invisibleLightTest(){
        String expectedResult = "Invisible light!";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detection(751);
        if (expectedResult == realResult){
            System.out.println("Invisible light test ok!");
        } else {
            System.out.println("Invisible light test fail!");
        }
    }

}

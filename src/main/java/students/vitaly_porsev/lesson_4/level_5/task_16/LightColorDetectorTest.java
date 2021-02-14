package students.vitaly_porsev.lesson_4.level_5.task_16;

class LightColorDetectorTest {

    public void LCDVioletTest(){
        String expectedResult = "Фиолетовый (\"Violet\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(400);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void LCDBlueTest(){
        String expectedResult = "Синий (\"Blue\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(470);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void LCDGreenTest(){
        String expectedResult = "Зеленый (\"Green\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(500);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void LCDYellowTest(){
        String expectedResult = "Желтый (\"Yellow\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(580);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void LCDOrangeTest(){
        String expectedResult = "Оранжевый (\"Orange\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(600);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void LCDRedTest(){
        String expectedResult = "Красный (\"Red\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(700);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }

    public void LCDInvisibleLightTest(){
        String expectedResult = "Невидимый спектр (\"Invisible Light\")";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(1000);
        if(expectedResult.equals(realResult)){
            System.out.println("Test OK");
        }else{
            System.out.println("Test FALSE");
        }
    }


}

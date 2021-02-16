package students.kristine_paskevica.lesson_4.level_7_task_25;

 class LightColorDetectorTest {

     public static void main(String[] args) {
         LightColorDetector lightColorDetector = new LightColorDetector();

         lightColorDetector.testViolet(405);
         lightColorDetector.testBlue(475);
         lightColorDetector.testGreen(505);
         lightColorDetector.testYellow(585);
         lightColorDetector.testOrange(619);
         lightColorDetector.testRed(620);
         lightColorDetector.testInvisible(760);
     }
 }

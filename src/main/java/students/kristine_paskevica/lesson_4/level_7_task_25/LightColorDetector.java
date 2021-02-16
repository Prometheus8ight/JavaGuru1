package students.kristine_paskevica.lesson_4.level_7_task_25;

 class LightColorDetector {

         public void rezultParb(String realsRez, String rezultParbaude){
             if (realsRez.equals(rezultParbaude)){
                 System.out.println("Krāsu tests " + rezultParbaude + " nav precīzss");
             }
             else {
                 System.out.println("Krāsu tests " + rezultParbaude + " ir precīzss");
             }
         }

         public void testViolet(int wavelength) {
             String rezultParbaude = "Violets";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public void testBlue(int wavelength) {
             String rezultParbaude = "Zils";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public void testGreen(int wavelength) {
             String rezultParbaude = "Zaļš";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public void testYellow(int wavelength) {
             String rezultParbaude = "Dzeltens";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public void testOrange(int wavelength) {
             String rezultParbaude = "Oranžs";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public void testRed(int wavelength) {
             String rezultParbaude = "Sarkans";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public void testInvisible(int wavelength) {
             String rezultParbaude = "Nevar noteikt krāsu";
             String realsRez = detect(wavelength);
             rezultParb(realsRez, rezultParbaude);
         }
         public String detect(int wavelength){
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

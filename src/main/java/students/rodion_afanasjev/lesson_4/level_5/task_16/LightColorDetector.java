package students.rodion_afanasjev.lesson_4.level_5.task_16;

class LightColorDetector {

    public String detect(int waveLength) {
        if (waveLength >= 380 && waveLength <= 449) {
            return "Violet";
        } else if (waveLength >= 450 && waveLength <= 494) {
            return "Blue";
        } else if (waveLength >= 495 && waveLength <= 569) {
            return "Green";
        } else if (waveLength >= 570 && waveLength <= 589) {
            return "Yellow";
        } else if (waveLength >= 590 && waveLength <= 619) {
            return "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

    public void detectColor(String waveLength) {
        switch(waveLength){
            case "Violet" :
                System.out.println("Violet");
                break;
            case "Blue" :
                System.out.println("Blue");
                break;
            case "Green" :
                System.out.println("Green");
                break;
            case "Yellow" :
                System.out.println("Yellow");
                break;
            case "Orange" :
                System.out.println("Orange");
                break;
            case "Red" :
                System.out.println("Red");
                break;
            case "Invisible Light" :
                System.out.println("Invisible Light");

        }
    }
}

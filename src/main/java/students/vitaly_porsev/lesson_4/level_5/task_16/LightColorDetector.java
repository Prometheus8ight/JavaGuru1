package students.vitaly_porsev.lesson_4.level_5.task_16;

class LightColorDetector {

    public String detect(int wavelength) {
        if (wavelength >= 380 && wavelength <= 449) {
            return "Фиолетовый (\"Violet\")";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return "Синий (\"Blue\")";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return "Зеленый (\"Green\")";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return "Желтый (\"Yellow\")";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return "Оранжевый (\"Orange\")";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return "Красный (\"Red\")";
        } else {
            return "Невидимый спектр (\"Invisible Light\")";
        }
    }
}

package students.lolita_polakova.lesson_3.level_7.task_28;

class CupOfTea {

    String material;
    String label;
    double temperature;

    CupOfTea(String cupMaterial, String teaLabel, double teaTemperature) {
        this.material = cupMaterial;
        this.label = teaLabel;
        this.temperature = teaTemperature;
    }
    public void info() {
        System.out.println("I'm made out of " + this.material);
        System.out.println("The taste is fantastic: " + this.label);
        System.out.println("I'm sooo hot: " + this.temperature + "degrees");
    }

     public void  changeTemperature(double newTemperature) {
        this.temperature = newTemperature;
        System.out.println("Brrr, getting cold: " +newTemperature + " degrees.. Drink me faster!!!");
    }

}

class CupOfTeaDemo {

    public static void main(String[] args) {

        CupOfTea tea = new CupOfTea("porcelain","Apsara",88.7);
        tea.info();
        tea.changeTemperature(42.1);
    }
}
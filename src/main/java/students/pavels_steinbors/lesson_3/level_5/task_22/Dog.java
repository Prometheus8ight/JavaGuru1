package students.pavels_steinbors.lesson_3.level_5.task_22;

class Dog {

    String name;
    String color;
    String voice;
    String color2;

    Dog(String dogsName, String dogsColor, String dogsVoice) {
        this.name = dogsName;
        this.color = dogsColor;
        this.voice = dogsVoice;
    }

    public void sayYourName() {
        System.out.println("Dog's name is: " + this.name);
    }

    public void voice() {
        System.out.println("Voice: " + this.voice);
    }

    public void myDogColor() {
        System.out.println("My dog's color is " + this.color);
    }

    void changeColor(String newColor) {
        this.color2 = newColor;

        System.out.println("My dog's new color is " + this.color2);

    }
}

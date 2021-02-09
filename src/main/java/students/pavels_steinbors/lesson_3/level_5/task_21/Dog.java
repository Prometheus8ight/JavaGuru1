package students.pavels_steinbors.lesson_3.level_5.task_21;

class Dog {
    String name;
    String color;
    String voice;

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

}

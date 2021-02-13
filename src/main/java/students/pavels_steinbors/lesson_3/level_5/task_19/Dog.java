package students.pavels_steinbors.lesson_3.level_5.task_19;

class Dog {
    String name;

    Dog(String dogsName) {
        this.name = dogsName;
    }
    String voice = "Roy ";
    int age = 3;

    public void sayYourName() {
        System.out.println("Dog's name is: " + this.name);
    }
    public void voice() {
        System.out.println("Voice: " + voice + voice + voice);
    }
    public void howOldAreYou() {
        System.out.println("Dog's age is: " + age);
    }
}


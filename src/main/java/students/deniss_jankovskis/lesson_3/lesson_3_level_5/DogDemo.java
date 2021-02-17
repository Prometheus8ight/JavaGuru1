package students.deniss_jankovskis.lesson_3.lesson_3_level_5;

class DogDemo {

    public static void main(String[] args) {
        Dog dog = new Dog("Gucci", 4);
        System.out.println();

        Dog dog1 = new Dog("Gucci", 4);
        dog1.setVoice();
        System.out.println();


        Dog dog2 = new Dog("Gucci", 4);
        dog2.happyBirthday();
        System.out.println();


        Dog dog3 = new Dog("Gucci", 4);
        dog3.voice();
        dog3.yourColor("Black");
        System.out.println();

        Dog dog4 = new Dog("Gucci", 4);
        dog4.changeColor("White");
        System.out.println();








    }
}

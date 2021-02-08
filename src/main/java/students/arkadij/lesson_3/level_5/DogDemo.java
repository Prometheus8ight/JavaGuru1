package students.arkadij.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("How old is your dog?");
        String dogAge = scanner.nextLine();

        System.out.println("Does your dog have a name?");
        String name = scanner.nextLine();

        Dog doggy = new Dog(name);

        System.out.println("You have a wonderful dog named " + name + " and your dog is only " + dogAge + " years old.");
        System.out.println("The dog makes a voice:");
        doggy.voice();

    }
}

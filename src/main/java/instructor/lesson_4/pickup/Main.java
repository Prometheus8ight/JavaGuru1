package instructor.lesson_4.pickup;

public class Main {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        PickUpLineGenerator generate = new PickUpLineGenerator();

        String gender = prompter.promptGender();
        String name = prompter.promptName();

        String pickUpLine = generate.generate(gender, name);

        System.out.println(pickUpLine);
    }
}

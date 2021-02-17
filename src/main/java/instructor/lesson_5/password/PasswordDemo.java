package instructor.lesson_5.password;

class PasswordDemo {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        int passwordLength = prompter.promptPasswordLength();

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String password = passwordGenerator.generate(passwordLength);

        System.out.println("Password = " + password);

    }
}

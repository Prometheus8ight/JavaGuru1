package instructor.lesson_6.slots;

import java.util.Arrays;

class SlotGame {

    int balance = 200;
    SlotMachine slotMachine = new SlotMachine();
    Prompter prompter = new Prompter();

    void play() {
        while (balance > 0) {
            System.out.println("Your balance: " + balance);

            String youGame = prompter.promptNextRound();

            if ("NO".equals(youGame)) {
                System.out.println("Thank you for the money 💰");
                break;
            }

            String[] row = slotMachine.spin();

            System.out.println("-= NEXT ROUND =-");
            System.out.println(Arrays.toString(row));

            if (isWin(row)) {
                System.out.println("🎉🍾 YOU WON! 🎉🤩");
                balance += 50;
            } else {
                System.out.println("😭 YOU LOST! 😭");
                balance -= 10;
            }
        }

        if (balance <= 0) {
            System.out.println("OUT OF CASH! 💸");
        }

    }

    boolean isWin(String[] row) {
        return row[0].equals(row[1]) && row[1].equals(row[2]);
    }
}

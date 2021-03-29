package instructor.lesson_6.slots;

public class SlotDemo {

    public static void main(String[] args) {

        SlotGame game = new SlotGame();

        System.out.println("game.getBalance() = " + game.getBalance());

        game.play();

//        SlotMachine slotMachine = new SlotMachine();

//        for (int i = 0; i < 15; i++) {
//            System.out.println(Arrays.toString(slotMachine.spin()));
//        }

    }
}

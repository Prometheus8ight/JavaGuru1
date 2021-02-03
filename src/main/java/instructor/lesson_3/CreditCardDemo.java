package instructor.lesson_3;

public class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard myCard = new CreditCard();
        myCard.holderName = "John Doe";
        myCard.bank = "SmolBank";
        myCard.paymentProcessor = "MasterKard";
        myCard.number = "4325 1234 8765 4860";
        myCard.securityCode = "123";
        myCard.expirationDate = "01/22";

        System.out.println("myCard.holderName = " + myCard.holderName);
        System.out.println("myCard.bank = " + myCard.bank);
        System.out.println("myCard.paymentProcessor = " + myCard.paymentProcessor);
        System.out.println("myCard.number = " + myCard.number);
        System.out.println("myCard.securityCode = " + myCard.securityCode);
        System.out.println("myCard.expirationDate = " + myCard.expirationDate);

    }
}

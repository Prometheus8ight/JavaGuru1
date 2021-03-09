package students.alex_kalashnikov.lesson_7.level_6.task_10;

class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard newCreditCard = new CreditCard(4444-5555-6666-7777, 1234);

        newCreditCard.deposit();
        newCreditCard.showBalance();
        newCreditCard.setCreditLimit();
        newCreditCard.showCreditLimit();
        newCreditCard.withdrawal();
        newCreditCard.showBalance();
        newCreditCard.showIndebtedness();
        newCreditCard.deposit();
        newCreditCard.deposit();
        newCreditCard.showBalance();
        newCreditCard.showIndebtedness();
        newCreditCard.withdrawal();
        newCreditCard.showBalance();
        newCreditCard.showIndebtedness();

    }

}

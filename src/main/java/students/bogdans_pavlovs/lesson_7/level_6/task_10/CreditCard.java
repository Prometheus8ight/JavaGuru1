package students.bogdans_pavlovs.lesson_7.level_6.task_10;

class CreditCard {

    //Свойства
    final String cardNumber;
    final int pinNumber;
    private int creditLimit = 200;

    //Начальный баланс и задолженность по кредиту равны 0
    private int balance;
    private int moneyOwed;



    //Кредитный лимит можно менять после создания карты
    void changeCreditLimit(int newLimit){
        creditLimit = newLimit;
    }

    //Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена
    boolean pinNumberCheck(int pinNumber){
        if (pinNumber == this.pinNumber){
            return true;
        } else {
            return false;
        }
    }

    //При создании карты нужно указывать ее номер и пинкод
    public CreditCard(String cardNumber, int pinNumber) {
        this.cardNumber = cardNumber;
        this.pinNumber = pinNumber;
    }

    public int getBalance(){
        return balance;
    }

    public int getCreditLimit(){
        return creditLimit;
    }


    //При зачислении средств на карту необходимо указывать пин-код и желаемую сумму
    public void deposit (int pinNumber, int depositAmount){

        int creditShare = 0;

        //Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена
        if (!pinNumberCheck(pinNumber)){
            System.out.println("Invalid Pin");
            return;
        }

        //В первую очередь зачисление покрывает задолженность по кредиту
        if (moneyOwed > 0){

            creditShare = moneyOwed;
            moneyOwed = moneyOwed - depositAmount;
        }

        //Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса
        if (moneyOwed <= 0){
            balance = balance + depositAmount - creditShare;
        }
    }

    //При снятии средств с карты необходимо указывать пин-код и желаемую сумму
    public void withdraw (int pinNumber, int withdrawAmount){

        //Если пин-коды не совпадают, операция по снятию денег должна быть отклонена
        if (!pinNumberCheck(pinNumber)){
            System.out.println("Invalid Pin");
            return;
        }

        //Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту
        //Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

        if (withdrawAmount > balance){

            if (withdrawAmount > balance + creditLimit) {
                System.out.println("Not enough money");
            } else {

                moneyOwed = moneyOwed + withdrawAmount - balance;
                balance = 0;
            }

        } else {
            balance = balance - withdrawAmount;
        }

    }

}

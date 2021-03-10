package students.julija_katukova.lesson_7.level_6.task_10;

class CreditCard {
    private String cardNumber;
    private String pinCode;
    private int balance;
    private int creditLimit; // in positive num
    private int loanDebt; // in positive num

    public CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public int setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
        return creditLimit;
    }

    public boolean deposit(String pinCode, int amount) {
        if (!pinCode.equals(this.pinCode)) { //пин-коды не совпадают, операция должна быть отклонена
            return false;
        }

        if (loanDebt == 0) {
            balance = balance + amount;
        }

        if (loanDebt > 0) {
            amount = amount - loanDebt;
            loanDebt = 0; //полгасили задолжность внесением денег
            balance = amount;
            }
        return true;
    }

    public void withdraw(String pinCode, int amount) { //указывать пин-код и желаемую сумму
        if (!pinCode.equals(this.pinCode)) { //пин-коды не совпадают, операция должна быть отклонена
            System.out.println("Incorrect PIN");
        } else {
            if (amount <= balance) {
                balance = balance - amount; //Деньги снимаются с карточного баланса
            } else {
                if (-(balance - amount - loanDebt) > creditLimit) { // сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена
                    System.out.println("Sorry, you exceed your credit limit");
                } else {
                    loanDebt = -(balance - amount); //остаток суммы нужно брать за счет задолженности по кредиту
                    balance = 0;
                }
            }
        }
    }

    public String getInformation(String cardNumber, String pinCode) {
        String a = "Card number = " + this.cardNumber + ", ";
        String b = "PIN = " + this.pinCode + ", ";
        String c = "Balance = " + this.balance + ", ";
        String d = "Credit Limit = " + this.creditLimit + ", ";
        String e = "Loan Debt = " + this.loanDebt + ". ";
        return a + b + c + d + e;
    }
}

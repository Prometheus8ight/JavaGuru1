package students.Dmitry_Gr.lesson_7.level_6.task_10;

public class CreditCard {


        private String cardNumber;
        private int pinCode;
        private int balance;
        private int creditLimit;
        private int loanDebt;


        public CreditCard(String cardNumber, int pinCode) {
            this.cardNumber = cardNumber;
            this.pinCode = pinCode;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void setCreditLimit(int creditLimit) {
            this.creditLimit = creditLimit;
        }

        public int getBalance() {
            return balance;
        }

        public int getLoanDebt() {
            return loanDebt;
        }

        private boolean checkPinCode(int pinCode) {
            if (pinCode == this.pinCode) {
                return true;
            } else {
                System.out.println("Incorrect PIN number! Please try again");
                return false;
            }
        }

        protected void withdraw(int pinCode, int withdrawalMoney) {
            if (checkPinCode(pinCode)) {
                moneyForWithdraw(withdrawalMoney);
            }
        }

        private void moneyForWithdraw(int withdraw) {
            if (withdraw > this.balance) {
                if (withdraw > this.balance + creditLimit) {
                    System.out.println("Your credit limit has been exceeded!");
                } else {
                    this.loanDebt += (withdraw - this.balance);
                    this.balance = 0;
                }
            } else {
                this.balance -= withdraw;
            }
        }


        protected void deposit(int pinCode, int depositMoney) {
            if (checkPinCode(pinCode)) {
                moneyForDeposit(depositMoney);
            }
        }

        private void moneyForDeposit(int deposit) {
            if (deposit <= this.loanDebt) {
                this.loanDebt -= deposit;
            } else if (loanDebt == 0) {
                this.balance += deposit;
            } else {
                this.balance += (deposit - this.loanDebt);
                this.loanDebt = 0;
            }
        }


    }


package students.bogdans_pavlovs.lesson_9.task_5;

class Safe {

    private final String password;
    private int money;

    public Safe(String password, int money) {
        this.password = password;
        this.money = money;
    }

    private boolean passwordCheck(String password){

        if(this.password.equals(password)){
            return true;
        } else {
            System.out.println("Incorrect Password");
            return false;
        }

    }

    public void deposit(String password, int amount) {

        if (passwordCheck(password)) {

            this.money = this.money + amount;

        }
    }
        public void withdraw (String password,int amount){

            if (passwordCheck(password)) {

                this.money = this.money - amount;

            }

        }

    public int getMoney() {
        return money;
    }

}


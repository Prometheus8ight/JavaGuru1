package students.kristine_paskevica.lesson_9.level_1;

class SeifsPiektaisUzd {
    private int pinKods;
    private int summa;

    public SeifsPiektaisUzd(int pinKods, int summa) {
        this.pinKods = pinKods;
        this.summa = summa;
    }

    public void getMoney(int pinKods, int summaKonta) {
        if (this.pinKods == pinKods) {
            if (summaKonta <= this.summa) {
                this.summa = this.summa - summaKonta;
            } else {
                System.out.println("Jūsu kontā nepietiek naudas!");
            }
        } else {
            System.out.println("Nepareizs pinkods!");
        }
    }

    public void putMoney(int pinKods, int depositSumma) {
        if (this.pinKods == pinKods) {
            this.summa = this.summa + depositSumma;
        } else {
            System.out.println("Nepareizs pinkods!");
        }
    }

    public void printAccountBalance() {
        System.out.println("Jūsu kontā ir šāda naudas summa: " + summa);
    }

}

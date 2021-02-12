package students.vitaly_porsev.lesson_4.level_6.task_17;

class Stock {
    String companyName;
    int currentValue;
    int minimalValue;
    int maxValue;

    public Stock(String companyName, int currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minimalValue = currentValue;
        this.maxValue = currentValue;
    }

    public void updateValue(int newValue) {
        this.currentValue = newValue;
        if (this.minimalValue > newValue) {
            this.minimalValue = newValue;
        } else if (this.maxValue < newValue) {
            this.maxValue = newValue;
        }
    }

    public void getPriceInformation() {
        System.out.println("Текущая стоимость: " + this.currentValue + ". Минимальная стоимость: " + this.minimalValue
                + ". Максимальная стоимость: " + this.maxValue + ".");
    }
}

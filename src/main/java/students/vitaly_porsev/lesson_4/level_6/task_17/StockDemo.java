package students.vitaly_porsev.lesson_4.level_6.task_17;

class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Google", 12);
        stock.getPriceInformation();
        stock.updateValue(15);
        stock.updateValue(8);
        stock.updateValue(14);
        stock.getPriceInformation();
    }

}

package students.kristine_paskevica.lesson_4.level_6_task_17;

class StockDemo {

    public static void main(String[] args) {

        Stock akcijas = new Stock("Google", 10);
        String priceInformation = akcijas.getPriceInformation();
        System.out.println(priceInformation);
        akcijas.vertibuAtjaunoshana(15);
        akcijas.vertibuAtjaunoshana(7);
        akcijas.vertibuAtjaunoshana(14);

        priceInformation = akcijas.getPriceInformation();
        System.out.println(priceInformation);

    }
}

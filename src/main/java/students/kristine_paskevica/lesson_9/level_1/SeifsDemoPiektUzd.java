package students.kristine_paskevica.lesson_9.level_1;

class SeifsDemoPiektUzd {
    public static void main(String[] args) {

        SeifsPiektaisUzd seifsPiektaisUzd = new SeifsPiektaisUzd(1478, 0);
        seifsPiektaisUzd.printAccountBalance();
        seifsPiektaisUzd.putMoney(1479, 500);
        seifsPiektaisUzd.printAccountBalance();
        seifsPiektaisUzd.putMoney(1478,500);
        seifsPiektaisUzd.printAccountBalance();
        seifsPiektaisUzd.getMoney(1480,40);
        seifsPiektaisUzd.printAccountBalance();
        seifsPiektaisUzd.getMoney(1478,40);
        seifsPiektaisUzd.printAccountBalance();


    }
}

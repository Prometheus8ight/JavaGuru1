package students.alex_kalashnikov.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isFraudByNickname(trader) || (isFraudByCity(trader));
    }

    private boolean isFraudByNickname(Trader trader) {
        return trader.getNickname().equals("Pokemon");
    }

    private boolean isFraudByCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }

}
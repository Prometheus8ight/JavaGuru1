package students.deniss_jankovskis.lesson_14.level_4;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {


    public List<Integer> findAllTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public List<Integer> findAllUniqueTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTransactionNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTransactionCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTraderNamesFromCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(cityToFind))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}

package students.vitaly_porsev.lesson_14.level_5.allTasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionAnalysisService {

    List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    List<Transaction> sortByValueAscending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortByValueDescending(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> findTransactionsByYearAndSortAscending(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Integer> findAllTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    List<Integer> findUniqueTransactionsYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> findUniqueTransactionsNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> findUniqueTransactionsCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    List<String> findTraderNamesFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean findTraderOfTheCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }
}

package students.alex_kalashnikov.lesson_14.level_4.all_tasks;

import java.util.*;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    List<Transaction> sortByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .collect(Collectors.toList());
    }

    /*
    если параметр year не указан,
    то возвращает все транзакции
     */
    List<Transaction> sortByYear(List<Transaction> transactions) {
        return new ArrayList<>(transactions);
    }

    List<Transaction> sortByIncreasingValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Transaction> sortByDecreasingValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparingInt(Transaction::getValue).reversed())
                .collect(Collectors.toList());
    }

    List<Transaction> sortByYearAndIncreasingValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    List<Integer> getYearsOfAllTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    Set<Integer> getUniqueYearsOfAllTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toSet());
    }

    Set<String> getAllTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

    Set<String> getAllTradersCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .collect(Collectors.toSet());
    }

    Set<String> getAllTradersNamesFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .collect(Collectors.toSet());
    }

}
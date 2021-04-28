package students.alex_kalashnikov.lesson_14.level_6.all_tasks;

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
        List<Integer> arr = new ArrayList<>();
        transactions.forEach(transaction -> arr.add(transaction.getYear()));
        return arr;
    }

    Set<Integer> getUniqueYearsOfAllTransactions(List<Transaction> transactions) {
        Set<Integer> arr = new HashSet<>();
        transactions.forEach(transaction -> arr.add(transaction.getYear()));
        return arr;
    }

    Set<String> getAllTradersNames(List<Transaction> transactions) {
        Set<String> arr = new HashSet<>();
        transactions.forEach(transaction -> arr.add(transaction.getTrader().getName()));
        return arr;
    }

    Set<String> getAllTradersCities(List<Transaction> transactions) {
        Set<String> arr = new HashSet<>();
        transactions.forEach(transaction -> arr.add(transaction.getTrader().getCity()));
        return arr;
    }

    Set<String> getAllTradersNamesFromCity(List<Transaction> transactions, String city) {
        Set<String> arr = new HashSet<>();
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .forEach(transaction -> arr.add(transaction.getTrader().getName()));
        return arr;
    }

    boolean isAnyTraderFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals(city));
    }

    int getMaxTransactionValue(List<Transaction> transactions) {
        try {
            return transactions.stream()
                    .max(Comparator.comparingInt(Transaction::getValue))
                    .get().getValue();
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    int getMinTransactionValue(List<Transaction> transactions) {
        try {
            return transactions.stream()
                    .min(Comparator.comparingInt(Transaction::getValue))
                    .get().getValue();
        } catch (NoSuchElementException e) {
            return 0;
        }
    }

    String getAllTradersNamesSorterByAlphabet(List<Transaction> transactions) {
        Set<String> arr = getAllTradersNames(transactions);
        return arr.stream()
                .sorted()
                .collect(Collectors.joining(","));
    }

    String getUniqueCitiesSorterByAlphabet(List<Transaction> transactions) {
        Set<String> arr = getAllTradersCities(transactions);
        return arr.stream()
                .sorted()
                .collect(Collectors.joining(","));
    }

}